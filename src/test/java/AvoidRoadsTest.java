import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AvoidRoadsTest {

    @Test
    void numWays() {
        assertEquals(2, new AvoidRoads().numWays(1, 1, new String[]{}));
        assertEquals(0, new AvoidRoads().numWays(2, 2, new String[]{"0 0 1 0", "1 2 2 2", "1 1 2 1"}));
        assertEquals(0, new AvoidRoads().numWays(1, 1, new String[]{"0 0 1 0", "0 0 0 1"}));
        assertEquals(1, new AvoidRoads().numWays(1, 1, new String[]{"1 0 1 1"}));
        assertEquals(1, new AvoidRoads().numWays(1, 1, new String[]{"0 1 1 1"}));
        assertEquals(0, new AvoidRoads().numWays(1, 1, new String[]{"1 0 1 1", "0 1 1 1"}));
        assertEquals(252, new AvoidRoads().numWays(6, 6, new String[]{"0 0 0 1", "6 6 5 6"}));
        assertEquals(1166309411843295530L, new AvoidRoads().numWays(19, 100, new String[]{"1 3 0 3", "0 4 0 3", "6 1 7 1", "4 7 4 8", "2 6 3 6",
                "0 6 0 7", "9 3 10 3", "2 4 2 3", "2 3 2 4", "7 6 7 7", "6 3 6 4", "8 7 8 8",
                "1 4 1 5", "0 2 1 2", "4 3 5 3", "2 9 2 10", "1 1 1 2", "9 5 8 5", "2 7 2 8", "6 0 7 0", "6 8 7 8",
                "2 2 2 1", "2 9 1 9", "5 8 5 9", "1 6 2 6", "9 4 8 4", "4 1 3 1", "7 5 8 5", "5 0 5 1", "3 6 2 6", "7 9 8 9", "6 8 7 8", "4 2 4 3",
                "5 0 4 0", "7 2 7 3", "4 4 5 4", "8 9 7 9", "5 3 6 3", "3 7 3 6", "0 8 1 8",
                "7 5 7 6", "9 3 10 3", "9 6 10 6", "1 9 1 10", "7 3 8 3", "4 6 4 7", "3 6 4 6", "3 1 3 0", "6 1 6 0", "8 3 7 3"}));
        assertEquals(5402543193164L, new AvoidRoads().numWays(24, 24, new String[]{"16 19 16 18", "11 7 11 6", "7 17 7 16", "20 8 20 7", "18 16 18 17",
                "8 21 8 22", "17 8 17 9", "9 21 8 21", "10 4 10 3", "1 20 1 21", "18 13 18 14", "13 18 13 17",
                "20 11 20 12", "20 7 20 8", "24 0 24 1", "5 23 4 23", "5 2 5 1", "13 17 13 16", "17 8 17 7", "13 23 14 23",
                "1 15 2 15", "3 12 3 11", "22 1 23 1", "7 24 6 24", "5 8 6 8", "17 1 18 1", "18 6 19 6", "19 12 18 12", "21 17 21 18",
                "17 10 17 9", "10 2 10 1", "4 7 3 7", "11 22 11 21", "20 22 20 23", "10 9 10 8",
                "1 3 1 4", "4 10 4 9", "14 8 15 8", "14 21 14 20", "12 20 12 21", "10 18 9 18", "13 16 13 17", "24 5 24 4",
                "17 15 17 16", "8 7 7 7", "1 9 0 9", "5 14 5 15", "10 5 11 5", "1 2 2 2", "1 15 1 16"}));
        assertEquals(2602994845445631L, new AvoidRoads().numWays(20, 100, new String[]{
                "0 2 0 3", "1 2 1 3", "2 2 2 3", "3 2 3 3", "4 2 4 3", "5 2 5 3", "6 2 6 3", "7 2 7 3", "8 2 8 3", "9 2 9 3"}));
    }
}