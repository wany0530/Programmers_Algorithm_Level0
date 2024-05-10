package 겹치는선분의길이;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */

public class Solution
{
    public int solution(int[][] lines)
    {
        List<Integer> list = new ArrayList<>();

        for(int[] intArr : lines)
        {
            for(int i = intArr[0]+1; i <= intArr[1]; i ++)
            {
                list.add(i);
            }
        }

        Map<Integer, Long> result = list.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()));
        return (int) result.values().stream().filter(e-> e > 1).count();
    }
}


