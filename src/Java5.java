public class Java5 {
    public static void main1(String[] args) {
        //判断素数，返回布尔值
        int n = 123321;
        // System.out.println(f(n));
       // System.out.println(f2(729));
    }

    public static boolean f(int n) {
        boolean s = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                s = false;
                System.out.println(i);
                break;
            }
        }
        return s;
    }

    //判断n是不是某一个数的三次方
    public boolean f2(int n) {
        boolean s = false;
        for (int i = 1; i < n; i++) {
            if (i * i * i == n) {
                s = true;
                System.out.println(i);
                break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Java5 j = new Java5();
        System.out.println(j.f2(77));
        Light.on();
        Light light = new Light();
        light.off();
        light.on();
        boolean on = true;
    }

}


