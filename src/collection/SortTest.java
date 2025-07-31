package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        list.forEach(System.out::println);
        list.sort(null);
//        list.forEach(System.out::println);
        SortTest test = new SortTest();
        List<Integer> sort = test.sort(list);
//        System.out.println(sort);
        Collections.sort(list);
//        list.forEach(System.out::println);
    }

    public List<Integer> sort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(min) - list.get(j) > 0) {
                    min = j;
                }
            }
            int temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
        return list;
    }
}
