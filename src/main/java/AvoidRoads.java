public class AvoidRoads {

    public long numWays(int width, int height, String[] bad) {

        int points[][] = new int[width+1][height+1];
        boolean blocked[][][][] = new boolean[width+1][height+1][width+1][height+1];

        points[0][0] = 1;

        for (String badpoints : bad) {
            String[] p = badpoints.split(" ");
            int w1 = Integer.parseInt(p[0]);
            int h1 = Integer.parseInt(p[1]);
            int w2 = Integer.parseInt(p[2]);
            int h2 = Integer.parseInt(p[3]);

            blocked[w1][h1][w2][h2] = blocked[w2][h2][w1][h1] = true;
        }

        for (int w = 0; w <= width; w++) {
            for (int h = 0; h <= height; h++) {
                if (w > 0 && !blocked[w][h][w-1][h]) {
                    points[w][h] += points[w-1][h];
                }
                if (h > 0 && !blocked[w][h][w][h-1]) {
                    points[w][h] += points[w][h-1];
                }
            }
        }

        return points[width][height];
    }

}
