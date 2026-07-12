package day12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class DedupTest {

    @Test
    void removesDuplicatesKeepingFirstOccurrenceOrder() {
        List<Integer> result = Dedup.removeDuplicates(Arrays.asList(3, 1, 3, 2, 1));
        assertEquals(Arrays.asList(3, 1, 2), result,
                "each value kept once, in the order it first appeared: [3, 1, 2]");
    }

    @Test
    void listWithNoDuplicatesComesBackUnchanged() {
        List<Integer> result = Dedup.removeDuplicates(Arrays.asList(5, 4, 3));
        assertEquals(Arrays.asList(5, 4, 3), result,
                "nothing to remove → same values, same order");
    }

    @Test
    void emptyListGivesEmptyList() {
        assertEquals(List.of(), Dedup.removeDuplicates(new ArrayList<>()),
                "an empty input produces an empty output");
    }

    @Test
    void doesNotModifyTheInputList() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 2));
        Dedup.removeDuplicates(input);
        assertEquals(Arrays.asList(1, 1, 2), input,
                "removeDuplicates must build a NEW list and leave the input alone");
    }
}
