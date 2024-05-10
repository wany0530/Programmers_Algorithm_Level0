package 분수의덧셈;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */
public class Solution
{
    private int numerator;
    private int denominator;

    public int[] solution(int numer1, int denom1, int numer2, int denom2)
    {
        denominator = denom1 * denom2;
        numerator = (numer1 * denom2) + (numer2 * denom1);

        return greatestCommonDivisor(numerator, denominator);
    }

    private int[] greatestCommonDivisor(int num1, int num2)
    {
        int minNum = Math.min(num1, num2);
        int max = 0;

        for(int i=1; i<=minNum; i++)
        {
            if(num1%i == 0 && num2%i == 0)
            {
                max = i;
            }
        }

        return new int[]{num1/max, num2/max};
    }
}
