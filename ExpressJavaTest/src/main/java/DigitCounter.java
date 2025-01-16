import java.util.ArrayList;
import java.util.Arrays;

public class DigitCounter {

    public int countDigits(int[] arr) {
        int result = 0;
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        while (!flag) {
            for (int i = 0; i < list.size(); i++) {
                int value = list.get(i);
                int counter = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) == value) counter++;
                }
                if (counter == 1) list.set(i, 1);
                else {
                    list.set(i, counter);
                    for (int j = i + 1; j < list.size(); j++) {
                        if (list.get(j) == value) {
                            list.remove(j);
                            j--;
                        }
                    }
                }
                if (list.size() == 1) {
                    result = list.getFirst();
                    flag = true;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 7, 5};
        int[] arr2 = {1, 1, 2, 2, 3, 3};
//        System.out.println(new DigitCounter().countDigits(arr1));
        System.out.println(new DigitCounter().countDigits(arr2));
    }
}
