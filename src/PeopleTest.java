import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PeopleTest {
    public static void main(String[] args) {
        People xmy = new People(2006, "熊梦瑶");
        People a = new People(1, "a");
        System.out.println(xmy.getName());
//        System.out.println(xmy.getName());
        // 面向抽象编程，面向接口编程
        People men = new Men();
//        Men men1 = new People();
        men.setName("xiong");
        System.out.println(men.getName());
    }

    public static void main1(String[] args) {
//        shape.Rectangle s = new shape.Rectangle();
//        System.out.println(s.length);
        List<Integer> list = new ArrayList<>();
        list = new ArrayList<>();
        System.out.println(list instanceof List);
        System.out.println(list.size());
    }
}
