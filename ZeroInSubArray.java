import java.util.Arrays;

public class ZeroInSubArray {
    public static void main(String[] args) {
        int[] list = {10,-10};
        System.out.println(iszero(list));
    }

    public static boolean iszero(int[] arr) {
        int[] arrdup = new int[arr.length];             // array with same lenth
        arrdup[0] = arr[0];                            // making duplicate array ( adding the eleemt of first)
        int i = 1;
        while (i < arr.length) {
            arrdup[i] = arrdup[i - 1] + arr[i];
            i++;
        }

        Arrays.sort(arrdup);                                /// making the array ascending

        for (int j = 0; j < arrdup.length - 1; j++) {
            int k = j + 1;
            if (arrdup[j] == arrdup[k]) {
                return true;
            }
            if (arrdup[j] == 0 || arrdup[k] == 0) {
                return true;
            }
        }
        return false;
    }
}