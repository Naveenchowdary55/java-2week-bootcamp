package day06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void newAccountRemembersOwnerAndOpeningBalance() {
        BankAccount acc = new BankAccount("Asha", 100.0);
        assertEquals("Asha", acc.getOwner(),
                "getOwner must return the name the account was opened with");
        assertEquals(100.0, acc.getBalance(), 1e-9,
                "a new account must start at its opening balance");
    }

    @Test
    void depositAddsAndReturnsTrue() {
        BankAccount acc = new BankAccount("Asha", 100.0);
        assertTrue(acc.deposit(50.0),
                "a valid deposit must return true");
        assertEquals(150.0, acc.getBalance(), 1e-9,
                "depositing 50 into 100 must leave a balance of 150");
    }

    @Test
    void depositOfZeroOrNegativeIsRejected() {
        BankAccount acc = new BankAccount("Asha", 100.0);
        assertFalse(acc.deposit(0.0),
                "depositing 0 must return false");
        assertFalse(acc.deposit(-20.0),
                "depositing a negative amount must return false");
        assertEquals(100.0, acc.getBalance(), 1e-9,
                "a rejected deposit must leave the balance unchanged");
    }

    @Test
    void withdrawSubtractsWhenFundsAllow() {
        BankAccount acc = new BankAccount("Asha", 100.0);
        assertTrue(acc.withdraw(40.0),
                "withdrawing within the balance must return true");
        assertEquals(60.0, acc.getBalance(), 1e-9,
                "withdrawing 40 from 100 must leave 60");
    }

    @Test
    void withdrawIsRejectedWhenTooLargeOrNotPositive() {
        BankAccount acc = new BankAccount("Asha", 100.0);
        assertFalse(acc.withdraw(150.0),
                "withdrawing more than the balance must return false");
        assertFalse(acc.withdraw(0.0),
                "withdrawing 0 must return false");
        assertEquals(100.0, acc.getBalance(), 1e-9,
                "a rejected withdrawal must leave the balance unchanged");
    }
}
