package collection;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapTest {
    public Map<Integer, Integer> getMap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                map.compute(0, (k, v) -> v == null ? 1 : v + 1);
//            } else {
//                map.compute(1, (k, v) -> v == null ? 1 : v + 1);
//            }
            map.compute(list.get(i) % 2, (k, v) -> (v == null ? 0 : v) + 1);
            map.compute(list.get(i) % 2, (k, v) -> (Optional.ofNullable(v).orElse(0)) + 1);
        }
        return map;
    }


    public Map<Integer, Integer> getMap2(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i) % 2;
//            Integer count = map.get(key);
//            if (count == null) {
//                count = 0;
//            }
            // (v == null ? 0 : v)
            int count = Optional.ofNullable(map.get(key)).orElse(0);
//            count++;
            map.put(key, ++count);
        }
        return map;
    }


    public static void main1(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 1, 0, 0, 1, 0));
        Map<Integer, Integer> map = new MapTest().getMap2(list);
        System.out.println("女生：" + map.get(0));
        System.out.println("男生：" + map.get(1));
    }

    //入参【1，2，3，4】<1, 4> <0,6>
    public Map<Integer, Integer> mapSum(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            final int p = i;
            map.compute(list.get(i) % 2, (k, v) -> (v == null ? 0 : v) + list.get(p));
        }
        return map;
    }

    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Map<Integer, Integer> map = new MapTest().mapSum(list);
        System.out.println(map);
    }

    //入参【1，2，3，4】出参<0, [2,4]> ,<1,[1,3]>
    public Map<Integer, List<Integer>> mapList(List<Integer> list) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            final int p = i;
            map.compute(list.get(i) % 2, (key, oldList) -> {
                if (oldList == null) {
                    oldList = new LinkedList<>();
                }
                oldList.add(list.get(p));
                return oldList;
            });
        }
        return map;
    }

    public Map<Integer, List<Integer>> mapList2(List<Integer> list) {
        Map<Integer, List<Integer>> map2 = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map2.computeIfAbsent(list.get(i) % 2, k -> new LinkedList<>()).add(list.get(i));
        }
        return map2;
    }

    public Map<Integer, List<Integer>> mapList3(List<Integer> list) {
        return list.stream().collect(Collectors.groupingBy(el -> el % 2));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        list.stream().map(el -> el + 1).forEach(System.out::println);
        Map<Integer, List<Integer>> map = new MapTest().mapList3(list);
        System.out.println(map);
        Function<Integer, String> function = x -> "hello" + x;
        System.out.println(function.apply(1));
        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> 2 * (x + y);
        Integer ret = biFunction.apply(1, 2);
        System.out.println(ret);
        BiFunction<Integer, Integer, Integer> biFunction2 = new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer x, Integer y) {
                return x + y;
            }
        };
    }
}
