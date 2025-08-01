import java.util.ArrayList;
import java.util.List;

public class Java3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(array[10]);
        //无界R
        List<Integer> mylist = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            mylist.add(i+1);
        }
        System.out.println(mylist.size());
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));

        }

    }
}