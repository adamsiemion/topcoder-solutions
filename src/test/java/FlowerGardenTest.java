import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FlowerGardenTest {

    int[] a(int... values) {
        return values;
    }

    List<Integer> l(int... array) {
        return Arrays.stream(array).boxed().collect(Collectors.toList());
    }

    @Test
    void getOrdering() {
        assertEquals(l(1, 2, 3, 4, 5), l(new FlowerGarden().getOrdering(a(5, 4, 3, 2, 1), a(1, 1, 1, 1, 1), a(365, 365, 365, 365, 365))));
        assertEquals(l(5, 4, 3, 2, 1), l(new FlowerGarden().getOrdering(a(5, 4, 3, 2, 1), a(1, 5, 10, 15, 20), a(4, 9, 14, 19, 24))));
        assertEquals(l(1, 2, 3, 4, 5), l(new FlowerGarden().getOrdering(a(5, 4, 3, 2, 1), a(1, 5, 10, 15, 20), a(5, 10, 15, 20, 25))));
        assertEquals(l(3, 4, 5, 1, 2), l(new FlowerGarden().getOrdering(a(5, 4, 3, 2, 1), a(1, 5, 10, 15, 20), a(5, 10, 14, 20, 25))));
        assertEquals(l(2, 4, 6, 1, 3, 5), l(new FlowerGarden().getOrdering(a(1, 2, 3, 4, 5, 6), a(1, 3, 1, 3, 1, 3), a(2, 4, 2, 4, 2, 4))));
        assertEquals(l(4, 5, 2, 3), l(new FlowerGarden().getOrdering(a(3, 2, 5, 4), a(1, 2, 11, 10), a(4, 3, 12, 13))));
    }
}