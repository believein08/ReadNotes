package sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @Test
    void should_sorted_after_sort() {
        assertArrayEquals(new int[]{5, 7, 8, 8, 8, 10, 19, 22}, BubbleSort.sort(new int[]{ 10, 8, 5, 8, 7, 19 ,8, 22}));
    }
}