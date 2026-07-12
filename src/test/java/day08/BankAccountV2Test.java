package day08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BankAccountV2Test {

    @Test
    void rejectsNegativeOpeningBalance() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccountV2("Asha", -1.0),
                "A negative opening balance is not allowed and should throw IllegalArgumentException");
    }

    @Test
    void rejectsBlankOwner() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccountV2("   ", 100.0),
                "A blank owner name is not allowed and should throw IllegalArgumentException");
    }

    @Test
    void depositAndWithdrawFollowTheRules() {
        BankAccountV2 acc = new BankAccountV2("Ben", 100.0);
        assertTrue(acc.deposit(50.0), "A positive deposit should succeed");
        assertEquals(150.0, acc.getBalance(), 1e-9, "Balance should be 100 + 50 after the deposit");
        assertFalse(acc.withdraw(500.0), "Withdrawing more than the balance should fail");
        assertEquals(150.0, acc.getBalance(), 1e-9, "A failed withdrawal must leave the balance unchanged");
    }

    @Test
    void setOwnerUpdatesButRejectsBlank() {
        BankAccountV2 acc = new BankAccountV2("Cara", 0.0);
        acc.setOwner("Cara Smith");
        assertEquals("Cara Smith", acc.getOwner(), "setOwner should update the owner name");
        assertThrows(IllegalArgumentException.class, () -> acc.setOwner(null),
                "setOwner(null) should be rejected with IllegalArgumentException");
    }

    @Test
    void successfulConstructionIncrementsCountByOne() {
        int before = BankAccountV2.getAccountCount();
        new BankAccountV2("Dev", 10.0);
        assertEquals(before + 1, BankAccountV2.getAccountCount(),
                "Creating one account should raise the account count by exactly 1");
    }

    @Test
    void failedConstructionDoesNotIncrementCount() {
        int before = BankAccountV2.getAccountCount();
        assertThrows(IllegalArgumentException.class, () -> new BankAccountV2("Elena", -5.0));
        assertEquals(before, BankAccountV2.getAccountCount(),
                "A rejected construction must NOT change the account count");
    }
}
