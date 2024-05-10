
package 문자열밀기;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */
public class Solution
{
    public int solution(String A, String B)
    {
        if(A.equals(B))
            return 0;

        char[] cArrA = A.toCharArray();
        int size = cArrA.length;

        for(int x=0; x < size; x++)
        {
            char temp = cArrA[size-1];
            for(int y=size-1; y > 0; y--)
            {
                cArrA[y] = cArrA[y-1];
            }
            cArrA[0] = temp;

            StringBuilder sb = new StringBuilder();
            String s = sb.append(cArrA).toString();

            if(B.equals(s))
            {
                return x+1;
            }
        }
        return -1;
    }
}