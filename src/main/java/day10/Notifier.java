// Day 10 exercise — see src/main/java/day10/README.md
package day10;

/**
 * Something that can send a message. This interface is PROVIDED. Different
 * implementations deliver the message different ways (email, SMS, push) but the
 * caller only knows the {@code Notifier} contract.
 *
 * <p>This is exactly the pattern you'll meet again with Spring: you code against
 * an interface, and the concrete implementation gets plugged in for you.
 */
public interface Notifier {

    /**
     * Sends the message.
     *
     * @param message the message to send
     * @return a string describing what was sent
     */
    String send(String message);
}
