package 연속된수의합;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public int[] solution(int num, int total)
    {
        List<Integer> list = new ArrayList<>();

        if(num % 2 == 1)
        {

            int middleValue = total / num; // 1
            list.add(middleValue);

            num -= 1; // 5 -> 4

            if(num != 0)
            {
                for(int i = 1; i <= num/2; i++)
                {
                    list.add(middleValue - i);
                    list.add(middleValue + i);
                }
            }

            return list.stream().sorted().mapToInt(Integer::intValue).toArray();
        }
        else
        {
            double value = total / (double)num;

            list.add((int) Math.abs(value));
            list.add((int) Math.ceil(value));

            num -= 2;
            if(num != 0)
            {
                int firstVal = (int)Math.abs(value);
                int secondVal = (int) Math.ceil(value);

                for(int i = 1; i <= num/2; i++)
                {
                    list.add(firstVal - i);
                    list.add(secondVal + i);
                }
            }
            return list.stream().sorted().mapToInt(Integer::intValue).toArray();
        }
    }
}