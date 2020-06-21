import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Question3 {

        public static int[] avoidFlood(int[] rains) {

            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int[] returnArr = new int[rains.length];

            for (int i = 0; i < rains.length; i++) {

                if (rains[i] > 0)

                    if (map.containsKey(rains[i])) {
                        int[] failArr = new int[0];
                        return failArr;

                    } else {
                        map.put(rains[i], 1);
                        returnArr[i] = -1;
                    }

                else {
                    int j = i;
                    while (!(j == rains.length) && !map.containsKey(rains[j])) {
                        j++;
                    }

                    if (map.size() == 0) {
                        returnArr[i] = 1;

                    } else if (j == rains.length) {
                        Object[] tempArr = map.keySet().toArray();
                        Object key = tempArr[new Random().nextInt(tempArr.length)];
                        returnArr[i] = (int) key;
                        map.remove(key);

                    } else {
                        returnArr[i] = rains[j];
                        map.remove(rains[j]);
                    }
                }
            }
            return returnArr;
        }
}










