package day12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class StudentSorterTest {

    @Test
    void sortsByMarksHighestFirst() {
        List<StudentRecord> input = Arrays.asList(
                new StudentRecord("Asha", 55),
                new StudentRecord("Ben", 91),
                new StudentRecord("Cara", 73));
        List<StudentRecord> sorted = StudentSorter.sortedByMarksDescending(input);
        assertEquals(91, sorted.get(0).getMarks(), "highest marks first");
        assertEquals(73, sorted.get(1).getMarks(), "then the middle score");
        assertEquals(55, sorted.get(2).getMarks(), "lowest marks last");
    }

    @Test
    void doesNotModifyTheInputList() {
        List<StudentRecord> input = new ArrayList<>(Arrays.asList(
                new StudentRecord("Asha", 55),
                new StudentRecord("Ben", 91)));
        StudentSorter.sortedByMarksDescending(input);
        assertEquals("Asha", input.get(0).getName(),
                "the original list order must be untouched — sort a COPY");
        assertEquals("Ben", input.get(1).getName(),
                "the original list order must be untouched — sort a COPY");
    }

    @Test
    void emptyListSortsToEmptyList() {
        assertEquals(0, StudentSorter.sortedByMarksDescending(new ArrayList<>()).size(),
                "sorting an empty list gives an empty list");
    }
}
