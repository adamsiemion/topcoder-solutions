import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AvoidRoadsTest {

    @Test
    void numWays() {
        assertEquals(252, new AvoidRoads().numWays(6, 6, new String[]{"0 0 0 1", "6 6 5 6"}));
        assertEquals(2, new AvoidRoads().numWays(1, 1, new String[]{}));
        assertEquals(0, new AvoidRoads().numWays(2, 2, new String[]{"0 0 1 0", "1 2 2 2", "1 1 2 1"}));
    }
}