public class AvoidRoads {

    public long numWays(int width, int height, String[] bad) {

        long points[][] = new long[width+2][height+2];
        boolean blocked[][][] = new boolean[width+1][height+1][2];

        points[0][0] = 1;

        for (String badpoints : bad) {
            String[] p = badpoints.split(" ");
            int w1 = Integer.parseInt(p[0]);
            int h1 = Integer.parseInt(p[1]);
            int w2 = Integer.parseInt(p[2]);
            int h2 = Integer.parseInt(p[3]);

            if (w1 != w2) {
                blocked[Math.min(w1, w2)][h1][0] = true;
            } else if (h1 != h2) {
                blocked[w1][Math.min(h1, h2)][1] = true;
            } else {
                throw new RuntimeException();
            }
        }

        for (int w = 0; w <= width; w++) {
            for (int h = 0; h <= height; h++) {
                if (!blocked[w][h][0]) {
                    points[w+1][h] += points[w][h];
                }
                if (!blocked[w][h][1]) {
                    points[w][h+1] += points[w][h];
                }
            }
        }

        return points[width][height];
    }

}
