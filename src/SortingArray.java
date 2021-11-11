import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 7, 11, 3, 77, 24, 1, 62};
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length - 1; i += 1) {
            System.out.print(arr[i] + " ");
        }
    }

}
