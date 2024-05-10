package 다항식더하기;

/**
 * @author : ljw6398@nets.co.kr
 * @TeskContents :
 */
import java.util.Arrays;

public class Solution {
    public String solution(String polynomial)
    {
        String[] arr = polynomial.split("\\+");

        String[] xArr = Arrays.stream(arr)
                .map(e-> e.trim())
                .filter(e -> e.endsWith("x"))
                .toArray(String[]::new);

        String[] numArr = Arrays.stream(arr)
                .map(e-> e.trim())
                .filter(e -> !e.contains("x"))
                .toArray(String[]::new);

        int xnum = 0;
        int valueNum = 0;

        for(String value : numArr)
        {
            valueNum += Integer.parseInt(value);
        }

        for(String xValue : xArr)
        {
            if(xValue.startsWith("x"))
                xnum++;
            else
                xnum += Integer.parseInt(xValue.replace("x", ""));
        }

        String finalXnum = xnum <= 1 ? "" : String.valueOf(xnum);

        if(xnum == 0) return valueNum + "";

        if(valueNum == 0) return finalXnum + "x";

        return finalXnum + "x + " + valueNum;
    }
}