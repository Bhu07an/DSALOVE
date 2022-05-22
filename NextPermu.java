import java.util.Arrays;

public class NextPermu {
    public static void main(String[] args) {
        int[] arr8 = {1,2,3,6,5,4};
        nextper(arr8);
    }

    public static void nextper(int[] arr) {

        int index = 0;
        int low = 0;
        int high = 0;

        for (int i = arr.length - 1; i > 0; i--) {

            if (arr[i - 1] < arr[i]) {
                low = arr[i - 1];
                high = arr[i];
                index = i;
                break;
            }
        }
        if (high == 0) {
            reverse(arr, 0);
            System.out.println(Arrays.toString(arr));
        } else {
            for (int j = index + 1; j <= arr.length - 1; j++) {
                if (arr[j] > low && arr[j] < high) {
                    swap(arr, index - 1, j);
                    break;
                }
            }
            reverse(arr, index);
            System.out.println(Arrays.toString(arr));


        }

    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int startindex) {
        int lastinddex = arr.length - 1;
        for (int i = startindex; i < lastinddex; i++) {

            swap(arr, i, lastinddex);
            lastinddex--;
        }


    }
}

