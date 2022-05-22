import java.util.Arrays;

public class KthSmallestINarray {

    public static void main(String[] args) {


        int[] list = {0,1,1,1,0,1,0,0,0,2,1,2};
        int[] updatelist = ascending(list);
        System.out.println(Arrays.toString(updatelist));



    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


    public static int[] ascending(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j <= arr.length - 1; j++) {


                if (arr[i] > arr[j]) {

                    swap(arr, i, j);

                }


            }


        }

        return arr;
    }


}
