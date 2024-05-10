package 잘라서배열로저장하기;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public String[] solution(String my_str, int n)
    {
        List<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder(my_str);

        for(int i = 0; i < my_str.length()/n; i++)
        {
            list.add(sb.substring(0, n));
            sb = sb.delete(0, n);
        }

        if(sb.length() != 0)
            list.add(sb.toString());

        return list.toArray(new String[list.size()]);
    }
}
