public class MathTest {
    public static void main(String[] args) {
//        System.out.println(Math.abs(-23));
//        System.out.println(Math.min(2, 3));
//        System.out.println(Math.sin(Math.PI / 2));
        int[] a = {1, 23, 32, 43, 2};
//        System.out.println(max(a));
        System.out.println(max2(a));
    }

    public static int max(int[] iarr) {
        if (iarr == null) {
            throw new NullPointerException("入参为空");
        }
        if (iarr.length < 1) {
            throw new NullPointerException("数组长度不足");
        }
        int max = iarr[0];
        for (int i = 1; i < iarr.length; i++) {
            max = Math.max(max, iarr[i]);
        }
        return max;
    }

    public static int max2(int[] iarr) {
        if (iarr == null) {
            throw new NullPointerException("入参为空");
        }
        if (iarr.length < 1) {
            throw new NullPointerException("数组长度不足");
        }
        int max = iarr[0];
        int secondMax = Math.min(iarr[0], iarr[1]);

        for (int i = 1; i < iarr.length; i++) {
            max = Math.max(max, iarr[i]);
            if (max > secondMax) {
                secondMax = Math.max(secondMax, iarr[i]);
            }
        }
        return secondMax;
    }

    public static int secondMax(int[] iarr) {
        if (iarr == null) {
            throw new NullPointerException("入参为空");
        }
        if (iarr.length < 2) {
            throw new NullPointerException("数组长度不足");
        }
        for (int i = 0; i < 2; i++) {
            int max = i;
            for (int j = i + 1; j < iarr.length; j++) {
                if (iarr[max] < iarr[j]) {
                    max = j;
                }
            }
            int temp = iarr[i];
            iarr[i] = iarr[max];
            iarr[max] = temp;
        }
        System.out.println(iarr[1]);
        boolean allsome = true;
        for (int i = 0; i < iarr.length; i++) {
            if (iarr[i] != iarr[0]) {
                allsome = false;
                break;
            }
        }
        if (allsome) {
            throw new NullPointerException("数组所有元素相同，没有第二大的值");
        }
        return Math.min(iarr[0], iarr[1]);
    }
}
