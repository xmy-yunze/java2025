import java.math.BigDecimal;
import java.math.BigInteger;

public class BigTest {

    public static void main1(String[] args) {
        short s = 1;
        int a = 1;
        long l = 1L;
        BigInteger b = new BigInteger("1");
        BigDecimal d = new BigDecimal("2.0");
        System.out.println(d.intValue());
        System.out.println(d.doubleValue() / 3);
        System.out.println(d.divide(new BigDecimal("3"), 50, BigDecimal.ROUND_HALF_UP));
//        add
//        d.subtract()
//        d.multiply()
    }

    public static void add(String a, String b) {
        BigInteger b1 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);
        System.out.println(b1.add(b2));
    }

    public static void subtract(String a, String b) {
        BigInteger b1 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);
//        System.out.println(b1.subtract(b2));
        System.out.println(new BigInteger(a).subtract(new BigInteger(b)));
    }

    public static void multiply(String a, String b) {
        BigInteger b1 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);
        System.out.println(b1.multiply(b2));
    }

    public static BigInteger parseNumber(String str) {
        if(str == null || str.length() == 0){
            return null;
        }
        str = str.trim();
        str.charAt(0);
        char[] arr = str.toCharArray();
        //检查第一个字符
        if (arr[0] == '+' || arr[0] == '-' || isNumber(arr[0])) {
            //检查剩余字符
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < '0' || arr[i] > '9') {
                    return null;
                }
            }//纯字符的情况
            if ((arr[0] == '+' || arr[0] == '-') && arr.length == 1) {
                return null;
            }
        } else {
            return null;
        }
        return new BigInteger(str);
    }

    private static boolean isNumber(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static void divide(String a, String b) {
        if (a == null || b == null) {
            System.out.println("入参有空");
            throw new NullPointerException("入参有空");
        }
        BigInteger b1 = parseNumber(a);
        BigInteger b2 = parseNumber(b);
        if (b1 == null || b2 == null) {
            System.out.println("输入的不是有效数字");
            return;
        }
        if (b1.equals(BigInteger.ZERO)) {
            System.out.println("除数不能为零");
            return;
        }
        System.out.println(b1.divide(b2));
    }

    public static void main(String[] args) {
//        divide(" 121  ", "");
        MathTest.main(null);
    }

    public static void main2(String[] args) {
        add("12335", "22167");
        subtract("132", "321");
        multiply("1124586", "234567");
        divide("121", "11");
        byte[] barr = new byte[]{0};
        for (int i = 0; i < barr.length; i++) {
            barr[i] = (byte) i;
        }
        BigInteger x = new BigInteger(barr);
        System.out.println(x);
        System.out.println((byte) 129);
    }
}
