package day11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class SafeBankAccountTest {

    @Test
    void depositAddsToBalance() {
        SafeBankAccount acc = new SafeBankAccount("Asha", 100.0);
        acc.deposit(50.0);
        assertEquals(150.0, acc.getBalance(), 1e-9,
                "deposit(50) on a balance of 100 should give 150");
    }

    @Test
    void withdrawSubtractsFromBalance() {
        SafeBankAccount acc = new SafeBankAccount("Asha", 100.0);
        assertDoesNotThrow(() -> acc.withdraw(40.0),
                "withdrawing 40 from 100 is allowed and must not throw");
        assertEquals(60.0, acc.getBalance(), 1e-9,
                "withdraw(40) on a balance of 100 should give 60");
    }

    @Test
    void negativeOpeningBalanceThrowsUnchecked() {
        // InvalidAmountException is UNCHECKED — no throws clause needed anywhere.
        assertThrows(InvalidAmountException.class,
                () -> new SafeBankAccount("Asha", -1.0),
                "a negative opening balance is a caller bug → unchecked InvalidAmountException");
    }

    @Test
    void depositOfZeroOrNegativeThrowsUnchecked() {
        SafeBankAccount acc = new SafeBankAccount("Asha", 100.0);
        assertThrows(InvalidAmountException.class, () -> acc.deposit(0.0),
                "deposit(0) is not a real deposit → unchecked InvalidAmountException");
        assertThrows(InvalidAmountException.class, () -> acc.deposit(-5.0),
                "deposit(-5) is a caller bug → unchecked InvalidAmountException");
    }

    @Test
    void overdrawThrowsCheckedWithAMessage() {
        SafeBankAccount acc = new SafeBankAccount("Asha", 100.0);
        // InsufficientBalanceException is CHECKED. assertThrows lets us test it
        // without a try/catch, but in real calling code the compiler would force
        // you to handle it — that is the whole difference from deposit().
        InsufficientBalanceException ex = assertThrows(
                InsufficientBalanceException.class,
                () -> acc.withdraw(1000.0),
                "withdrawing more than the balance is a recoverable business "
                        + "event → CHECKED InsufficientBalanceException");
        assertNotNull(ex.getMessage(),
                "give the exception a helpful message so the caller can tell the user why");
    }

    @Test
    void withdrawOfZeroOrNegativeThrowsUnchecked() {
        SafeBankAccount acc = new SafeBankAccount("Asha", 100.0);
        assertThrows(InvalidAmountException.class, () -> acc.withdraw(-10.0),
                "a bad withdraw amount is still a caller bug → unchecked InvalidAmountException");
    }
}
