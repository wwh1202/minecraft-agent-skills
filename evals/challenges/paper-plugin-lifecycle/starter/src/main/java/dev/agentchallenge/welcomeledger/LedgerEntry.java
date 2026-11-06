package dev.agentchallenge.welcomeledger;

import java.time.Instant;

public record LedgerEntry(Instant firstJoined, Instant lastSeen) {
    public LedgerEntry seenAt(Instant now) {
        return new LedgerEntry(firstJoined, now);
    }
}
