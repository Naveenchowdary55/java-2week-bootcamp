package day10;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NotifierTest {

    @Test
    void eachNotifierFormatsItsOwnPrefix() {
        assertEquals("EMAIL: hi", new EmailNotifier().send("hi"), "EmailNotifier prefixes with EMAIL:");
        assertEquals("SMS: hi", new SMSNotifier().send("hi"), "SMSNotifier prefixes with SMS:");
        assertEquals("PUSH: hi", new PushNotifier().send("hi"), "PushNotifier prefixes with PUSH:");
    }

    @Test
    void alertAllSendsThroughEveryNotifier() {
        Notifier[] notifiers = {new EmailNotifier(), new SMSNotifier(), new PushNotifier()};
        String[] expected = {"EMAIL: down", "SMS: down", "PUSH: down"};
        assertArrayEquals(expected, AlertService.alertAll(notifiers, "down"),
                "alertAll dispatches to each Notifier - the same interface-based dispatch Spring uses for dependency injection");
    }

    @Test
    void alertAllPreservesOrder() {
        Notifier[] notifiers = {new PushNotifier(), new EmailNotifier()};
        String[] expected = {"PUSH: x", "EMAIL: x"};
        assertArrayEquals(expected, AlertService.alertAll(notifiers, "x"),
                "Results should match the order of the notifiers array");
    }
}
