// Day 10 exercise — see src/main/java/day10/README.md
package day10;

/**
 * Broadcasts one message through many notifiers at once.
 */
public class AlertService {

    /**
     * Sends {@code message} through every notifier and collects the results.
     *
     * <p>Loop over {@code notifiers}, call {@code send(message)} on each, and
     * return a new {@code String[]} of the results in the same order. Each
     * notifier formats the message its own way — you don't need to know which
     * kind it is.
     *
     * @param notifiers the notifiers to send through
     * @param message   the message to broadcast
     * @return a new array where element {@code i} is {@code notifiers[i].send(message)}
     */
    public static String[] alertAll(Notifier[] notifiers, String message) {
        throw new UnsupportedOperationException("TODO: implement me");
    }
}
