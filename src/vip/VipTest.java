package vip;

public class VipTest {
    public String show(VideoVIP videoVIP) {
        return String.format("%s能看%d部电影", videoVIP.getName(),videoVIP.lookVideo());
    }

    public static void main(String[] args) {
        VipTest vipTest = new VipTest();
        System.out.println(vipTest.show(new Vip1()));
        vipTest.show(new Vip2());
        vipTest.show(new Vip3());
    }
}
