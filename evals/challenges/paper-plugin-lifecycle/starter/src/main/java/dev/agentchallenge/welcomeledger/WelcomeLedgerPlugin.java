package dev.agentchallenge.welcomeledger;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class WelcomeLedgerPlugin extends JavaPlugin implements Listener {
    private final ConcurrentMap<UUID, LedgerEntry> entries = new ConcurrentHashMap<>();
    private File ledgerFile;
    private YamlConfiguration ledger;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        ledgerFile = new File(getDataFolder(), "ledger.yml");
        ledger = YamlConfiguration.loadConfiguration(ledgerFile);
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("welcomeledger").setExecutor((sender, command, label, args) -> {
            if (args.length == 1 && args[0].equalsIgnoreCase("stats")) {
                sender.sendMessage("Tracked players: " + entries.size());
                return true;
            }
            return false;
        });
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Bukkit.getScheduler().runTaskAsynchronously(this, () -> {
            Instant now = Instant.now();
            String key = player.getUniqueId().toString();
            Instant first = ledger.contains(key + ".firstJoined")
                    ? Instant.parse(ledger.getString(key + ".firstJoined"))
                    : now;
            entries.put(player.getUniqueId(), new LedgerEntry(first, now));
            ledger.set(key + ".firstJoined", first.toString());
            ledger.set(key + ".lastSeen", now.toString());
            saveLedger();
            player.sendMessage(getConfig().getString("welcome-message", "Welcome back!"));
        });
    }

    private void saveLedger() {
        try {
            ledger.save(ledgerFile);
        } catch (IOException exception) {
            getLogger().severe("Could not save ledger: " + exception.getMessage());
        }
    }

    @Override
    public void onDisable() {
        saveLedger();
    }
}
