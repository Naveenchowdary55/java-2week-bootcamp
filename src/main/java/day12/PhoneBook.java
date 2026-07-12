// Day 12 exercise — see src/main/java/day12/README.md
package day12;

import java.util.List;

/**
 * A simple phone book backed by a {@link java.util.HashMap} from name → number.
 * This is where a Map earns its keep: looking up a number by name is instant,
 * no scanning.
 *
 * <p>You declare the field yourself. Hint: a single
 * {@code private final Map<String, String>} (create it with {@code new HashMap<>()})
 * holds everything.
 */
public class PhoneBook {

    /**
     * Adds a contact, but never overwrites an existing name.
     *
     * @param name   the contact's name
     * @param number the phone number
     * @return {@code true} if the contact was added; {@code false} if that name
     *         already existed (in which case nothing changes). Hint:
     *         {@code containsKey} lets you check before you {@code put}.
     */
    public boolean add(String name, String number) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Looks up a contact's number.
     *
     * @param name the name to look up
     * @return the stored number, or {@code null} if the name is not present
     */
    public String search(String name) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * Removes a contact.
     *
     * @param name the name to remove
     * @return {@code true} if a contact was removed, {@code false} if the name
     *         was not there
     */
    public boolean delete(String name) {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return how many contacts are stored
     */
    public int size() {
        throw new UnsupportedOperationException("TODO: implement me");
    }

    /**
     * @return all contact names, sorted alphabetically. A Map's keys have no
     *         reliable order, so you must sort them yourself. Hint: copy
     *         {@code map.keySet()} into a new {@code ArrayList} and call
     *         {@code Collections.sort(list)}.
     */
    public List<String> names() {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
