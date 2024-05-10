package 옹알이1;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution
{
    public int solution(String[] babbling)
    {
        List<String> answerList = new ArrayList<>();

        String[] arr = {"aya", "ye", "woo", "ma"};

        List<String> targetList = Arrays.asList(babbling);

        for(int i=0; i < targetList.size(); i++)
        {
            String target = targetList.get(i);

            for(String word : arr)
            {
                if(target.indexOf(word) != -1)
                {
                    target = target.replace(word, " ");
                }
            }

            if(target.trim().length() == 0)
            {
                answerList.add(target);
            }
        }

        return answerList.size();
    }
}
