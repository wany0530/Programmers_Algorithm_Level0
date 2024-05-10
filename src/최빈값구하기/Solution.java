package 최빈값구하기;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution
{
    public int solution(int[] array)
    {
        Map<Integer, Long> mapGroup = Arrays.stream(array)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Comparator<Map.Entry<Integer, Long>> comparator = new Comparator<Map.Entry<Integer, Long>>() {
            @Override
            public int compare(Map.Entry<Integer, Long> o1, Map.Entry<Integer, Long> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        };

        Map.Entry<Integer, Long> maxEntry = Collections.max(mapGroup.entrySet(), comparator);

        int maxValue = maxEntry.getValue().intValue();
        long maxValueCnt = mapGroup.values().stream().filter(e -> e == maxValue).count();

        return maxValueCnt > 1 ? -1 : maxEntry.getKey();
    }
}