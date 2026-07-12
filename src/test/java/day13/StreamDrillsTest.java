package day13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import day12.StudentRecord;

class StreamDrillsTest {

    @Test
    void sumsTheSquaresOfEvenNumbers() {
        assertEquals(20, StreamDrills.evensSquaredSum(Arrays.asList(1, 2, 3, 4)),
                "evens 2 and 4 → 4 + 16 = 20");
    }

    @Test
    void evensSquaredSumOfAllOddsIsZero() {
        assertEquals(0, StreamDrills.evensSquaredSum(Arrays.asList(1, 3, 5)),
                "no evens → nothing to add → 0");
    }

    @Test
    void topScorersKeepsAbove75SortedDescending() {
        List<StudentRecord> students = Arrays.asList(
                new StudentRecord("Asha", 60),
                new StudentRecord("Ben", 90),
                new StudentRecord("Cara", 76),
                new StudentRecord("Dan", 75));
        // Dan (exactly 75) is excluded — the rule is strictly greater than 75.
        assertEquals(Arrays.asList("Ben", "Cara"), StreamDrills.topScorers(students),
                "only marks > 75, highest first: Ben(90) then Cara(76)");
    }

    @Test
    void topScorersEmptyWhenNobodyQualifies() {
        List<StudentRecord> students = Arrays.asList(
                new StudentRecord("Asha", 10),
                new StudentRecord("Ben", 20));
        assertEquals(List.of(), StreamDrills.topScorers(students),
                "nobody above 75 → empty list");
    }
}
