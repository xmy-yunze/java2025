package palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(+121));
        System.out.println();
//        Arrays.stream(solution.toIntArray(123)).forEach(System.out::println);
        System.out.println(solution.reverse("abcd"));
    }

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        return this.isPalindrome(str);
    }

    public int[] toIntArray(int s) {
        List<Integer> list = new ArrayList<>();
        while (s != 0) {
            list.add(s % 10);
            s /= 10;
        }
        Integer[] array = list.toArray(new Integer[0]);
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[array.length - i - 1] = array[i];
        }
        return result;
    }

    public String reverse(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return new String(chars);
    }


    public boolean isPalindrome(String x) {
        if (x == null) {
            return false;
        }
        char[] chars = x.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
