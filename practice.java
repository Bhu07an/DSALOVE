import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int[] list = {5, 4, 7, 2, -8, 3};

        int i = 0;
        int j = list.length - 1;
        while (i < j) {
            // TO MAKE THE LIST ALL FIRST TO BE POSITIVE AND END NEGATIVE
            if (list[i] > 0 || list[i] == 0) {
                i++;
            } else if (list[j] < 0) {
                j--;
            } else {
                swap(list, i, j);
            }
        }

        System.out.println(Arrays.toString(list));
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
