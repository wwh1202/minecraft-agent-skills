package dev.agentchallenge.welcomeledger;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LedgerEntryTest {
    @Test
    void seeingPlayerAgainPreservesFirstJoinAndUpdatesLastSeen() {
        Instant first = Instant.parse("2026-01-01T00:00:00Z");
        Instant later = Instant.parse("2026-01-02T00:00:00Z");

        LedgerEntry updated = new LedgerEntry(first, first).seenAt(later);

        assertEquals(first, updated.firstJoined());
        assertEquals(later, updated.lastSeen());
    }
}
