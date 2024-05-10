package OX퀴즈;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public String[] solution(String[] quiz)
    {
        List<String> list = new ArrayList<>();

        for(String s : quiz)
        {
            String[] sArr = s.split(" ");
            int firstVal = Integer.parseInt(sArr[0]);
            int secondVal = Integer.parseInt(sArr[2]);
            int resultVal = Integer.parseInt(sArr[4]);

            if("+".equals(sArr[1]))
            {
                list.add(firstVal + secondVal == resultVal ? "O" : "X");
            }
            else
            {
                list.add(firstVal - secondVal == resultVal ? "O" : "X");
            }
        }

        return list.toArray(new String[list.size()]);
    }
}
