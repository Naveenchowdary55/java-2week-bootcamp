package day12;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class PhoneBookTest {

    @Test
    void addStoresAndSearchFindsIt() {
        PhoneBook pb = new PhoneBook();
        assertTrue(pb.add("Asha", "111"), "adding a new name returns true");
        assertEquals("111", pb.search("Asha"), "search returns the stored number");
        assertEquals(1, pb.size(), "one contact stored");
    }

    @Test
    void addDoesNotOverwriteExistingName() {
        PhoneBook pb = new PhoneBook();
        pb.add("Asha", "111");
        assertFalse(pb.add("Asha", "999"), "adding a name that already exists returns false");
        assertEquals("111", pb.search("Asha"),
                "the original number must survive — no overwrite");
    }

    @Test
    void searchMissingNameReturnsNull() {
        PhoneBook pb = new PhoneBook();
        assertNull(pb.search("Nobody"), "searching for an unknown name returns null");
    }

    @Test
    void deleteRemovesTheContact() {
        PhoneBook pb = new PhoneBook();
        pb.add("Asha", "111");
        assertTrue(pb.delete("Asha"), "deleting an existing name returns true");
        assertFalse(pb.delete("Asha"), "deleting it again returns false");
        assertEquals(0, pb.size(), "nothing left after deletion");
    }

    @Test
    void namesComeBackSortedAlphabetically() {
        PhoneBook pb = new PhoneBook();
        pb.add("Charlie", "3");
        pb.add("Asha", "1");
        pb.add("Ben", "2");
        assertEquals(Arrays.asList("Asha", "Ben", "Charlie"), pb.names(),
                "names() returns every name in alphabetical order");
    }
}
