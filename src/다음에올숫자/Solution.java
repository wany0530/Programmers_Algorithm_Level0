package 다음에올숫자;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */
public class Solution
{
    public int solution(int[] common)
    {
        int lastNum = common[common.length -1];
        int firstDiff = common[1] - common[0];
        int secondDiff = common[2] - common[1];

        return firstDiff == secondDiff
                ? lastNum + firstDiff
                : lastNum * (common[1] / common[0]);
    }
}