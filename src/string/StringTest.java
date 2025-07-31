package string;

public class StringTest {

    public static final String ABC = "abc";

    public static void main(String[] args) {
        String s1 = ABC;
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        //equals()比较值
        System.out.println(s1.equals(s3));
        s1 = "123";
        System.out.println(s1);
    }
}
