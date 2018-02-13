import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlowerGarden {

    static class Flower {
        int height, bloom, wilt;

        Flower(int height, int bloom, int wilt) {
            this.height = height;
            this.bloom = bloom;
            this.wilt = wilt;
        }

        @Override
        public String toString() {
            return String.valueOf(height);
        }
    }

    public int[] getOrdering(int[] height, int[] bloom, int[] wilt) {
        Set<Flower> flowersFromShortest = IntStream.range(0, height.length)
                .mapToObj(i -> new Flower(height[i], bloom[i], wilt[i]))
                .collect(Collectors.toCollection(() -> new TreeSet<Flower>(Comparator.comparingInt(flower -> flower.height))));

        final LinkedList<Flower> flowersPlanted = new LinkedList<>();
        final Iterator<Flower> flowersFromShortestIt = flowersFromShortest.iterator();
        flowersPlanted.addFirst(flowersFromShortestIt.next());

        for (int i = 1; i < flowersFromShortest.size(); i++) {
            Flower flowerToPlant = flowersFromShortestIt.next();

            int lastGoodPosition = flowersPlanted.size();
            for (int j = flowersPlanted.size() - 1; j >= 0; j--) {
                Flower flowerPlanted = flowersPlanted.get(j);
                if (flowerPlanted.height < flowerToPlant.height) {
                    if (flowerPlanted.bloom > flowerToPlant.wilt || flowerPlanted.wilt < flowerToPlant.bloom) {
                        lastGoodPosition = j;
                    } else {
                        break;
                    }
                }
            }

            flowersPlanted.add(lastGoodPosition, flowerToPlant);
        }

        return flowersPlanted.stream().mapToInt(flower -> flower.height).toArray();
    }

}
