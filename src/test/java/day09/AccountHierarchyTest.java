package day09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AccountHierarchyTest {

    @Test
    void savingsAddsInterestCorrectly() {
        SavingsAccount s = new SavingsAccount(1000.0);
        s.addInterest(5.0);
        assertEquals(1050.0, s.getBalance(), 1e-9,
                "5% interest on 1000 adds 50, so the balance should be 1050");
    }

    @Test
    void savingsRejectsNegativeRate() {
        SavingsAccount s = new SavingsAccount(1000.0);
        assertThrows(IllegalArgumentException.class, () -> s.addInterest(-1.0),
                "A negative interest rate should throw IllegalArgumentException");
    }

    @Test
    void savingsStillInheritsDeposit() {
        SavingsAccount s = new SavingsAccount(100.0);
        assertTrue(s.deposit(50.0), "SavingsAccount inherits deposit() from Account");
        assertEquals(150.0, s.getBalance(), 1e-9, "Inherited deposit should raise the balance to 150");
    }

    @Test
    void currentAccountCanOverdrawToTheLimit() {
        CurrentAccount c = new CurrentAccount(100.0, 50.0);
        assertTrue(c.withdraw(120.0), "Withdrawing 120 from 100 with a 50 overdraft is allowed");
        assertEquals(-20.0, c.getBalance(), 1e-9, "Balance should be -20 after overdrawing within the limit");
    }

    @Test
    void currentAccountCannotOverdrawPastTheLimit() {
        CurrentAccount c = new CurrentAccount(100.0, 50.0);
        assertFalse(c.withdraw(160.0), "Withdrawing 160 would push the balance to -60, past the -50 limit");
        assertEquals(100.0, c.getBalance(), 1e-9, "A rejected withdrawal must leave the balance unchanged");
    }

    @Test
    void currentAccountDepositStillWorks() {
        CurrentAccount c = new CurrentAccount(0.0, 100.0);
        assertTrue(c.deposit(75.0), "CurrentAccount inherits deposit() from Account");
        assertEquals(75.0, c.getBalance(), 1e-9, "Inherited deposit should raise the balance to 75");
    }
}
