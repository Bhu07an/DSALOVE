import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {                                // main method

        int[] array = {9,4,2,5,4,8,0,9,9,9};

        int[] updatearray = reverse(array);
        System.out.println("reverse array " + Arrays.toString(updatearray));

    }


    public static void swap(int[] arr, int i, int j) {                      // to swap array variable

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }

    public static int[] reverse(int[] arr) {                                // reverseing  array

        int i = 0;
        int j = arr.length - 1;


        while (i <  j) {


            swap(arr, i, j);
            i++;
            j--;

        }

        return arr;


    }


}
