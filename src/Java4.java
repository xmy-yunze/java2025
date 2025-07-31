import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
        System.out.println(Java5.f(11));

    }
    public static void main1(String[] args) {
        // 题目：编写一个 Java 程序，声明并初始化一个int类型变量num为 10，一个double类型变量price为 9.99，
        // 一个String类型变量name为 "Java Book"。然后将这些变量的值打印出来，
        // 格式为：“The number is [num], the price is [price], and the name is [name]”。
        //声明变量
        int num = 10;
        double price = 9.99;
        String name = "Java book";
        //打印输出
        System.out.println("The number is: " + num + " and price is: " + price + " and name is: " + name);

        // 题目：已知两个整数变量a = 7，b = 3，计算并输出它们的和、差、积、商（整数除法）和余数。
        //定义变量
        int a = 7, b = 3;
        //计算和、差、积、商（整数除法）和余数
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //题目：从控制台读取一个整数，判断它是正数、负数还是零，并输出相应的结果。
        //定义整数
        int d = -875647;
        //条件判断
        if (d > 0) {
            System.out.println("它是正数");
        } else if (d == 0) {
            System.out.println("它是零");
        } else {
            System.out.println("它是负数");
        }

        //题目：使用for循环计算 1 到 100 的整数之和，并打印结果。
        //定义变量
        int c = 0;
        //方法描述
        for (int i = 0; i < 101; i++) {
            c = c + i;
        }
        System.out.println(c);
        //题目：使用while循环打印出 10 以内的偶数。
        //while打印出10以内的数,并用if条件满足偶数的定义
        int t = 0;
        while (t < 9) {
            t += 1;
            if (t % 2 == 0) {
                System.out.println(t);
            }
        }
        //题目：创建一个包含 5 个整数的数组，初始化数组元素为 1, 3, 5, 7, 9。然后遍历数组并打印每个元素。
        //创建数组
        int[] xmy = {1, 3, 5, 7, 9};
        //遍历数组
        for (int i = 0; i < xmy.length; i++) {
            System.out.println(xmy[i]);
        }

    }
}
