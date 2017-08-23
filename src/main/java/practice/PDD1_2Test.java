package practice;

import java.math.BigInteger;

/**
 * Created by gongrui on 2017/8/9.
 */
public class PDD1_2Test {
    public static void main(String[] args) {
        String s = "72106547548473106236";
        BigInteger b = new BigInteger(s);
        BigInteger a = BigInteger.valueOf(3);
        System.out.println(b.multiply(a));
        //648958927936257956124

    }
}
