package collection;

import java.util.*;
import java.util.stream.Collectors;

public class Collection {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "python", "c", "javascript");
        List<String> retList = new ArrayList<>();
        for (String word : words) {
            if (word.length() > 3) {
                String words1 =String.format("%sTest", word);
                retList.add(words1);
            }
        }
        System.out.println(retList);

        List<String> longWords = words.stream()
                .filter(el -> el.length() > 3)
                .map(el -> el.concat("Test"))
                .collect(Collectors.toList());
        System.out.println(longWords);
        System.out.println(retList == longWords);
        System.out.println(retList.equals(longWords));

        Collection test = new Collection();
//        test.addAll();
    }

    public void addAll() {
        //数组转List
        List<String> words = Arrays.asList("java", "python", "c", "javascript");
        List<String> words2 = new ArrayList<>();
        words2.add("hello");
        words2.add("java");
        words2.addAll(words);
        System.out.println(words2);
    }
}
