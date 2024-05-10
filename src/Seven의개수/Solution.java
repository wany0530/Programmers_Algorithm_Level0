package Seven의개수;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */
import java.util.Arrays;

public class Solution
{
    public int solution(int[] array)
    {
        String[] arr = Arrays.stream(array).mapToObj(e->String.valueOf(e)).toArray(String[]::new);
        int cnt = 0;
        for(String s : arr)
        {
            cnt += s.chars().filter(e -> e == '7').count();
        }
        return cnt;
    }
}
