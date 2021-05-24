import java.math.BigInteger;
import java.util.*;

import static java.math.BigInteger.ZERO;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger sum = ZERO;
        for (int i = 1; i <= n; i++) {
            sum = sum.add(calculateFactorial(i));
        }
        System.out.println(sum);
    }
    private static BigInteger calculateFactorial(int uptoValue) {
        BigInteger answer = BigInteger.ONE;
        boolean oddUptoValue =((uptoValue&1)==1);
        int tempUptoValue = uptoValue;
        if(oddUptoValue)tempUptoValue = uptoValue - 1;
        int nextSum = tempUptoValue;
        int nextMulti = tempUptoValue;
        while (nextSum >= 2){
            answer = answer.multiply(BigInteger.valueOf(nextMulti));
            nextSum -= 2;
            nextMulti += nextSum;
        }
        if(oddUptoValue)answer = answer.multiply(BigInteger.valueOf(uptoValue));
        return answer;
    }
}
