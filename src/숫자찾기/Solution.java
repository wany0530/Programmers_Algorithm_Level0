package 숫자찾기;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */
public class Solution
{
    public int solution(int num, int k)
    {
        String stringNum = String.valueOf(num);
        String stringK = String.valueOf(k);
        int result = stringNum.indexOf(stringK);
        return result < 0 ? result : result+1;
    }
}
