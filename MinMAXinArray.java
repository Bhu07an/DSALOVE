import java.util.Arrays;

public class MinMAXinArray {
    public static void main(String[] args) {

      int[] list  =  {9,4,7,1,3,2};
      MaxMIn(list);

    }


    public static void MaxMIn(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i <= arr.length - 1; i++) {


            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {

                max = arr[i];
            }


        }

        System.out.println(" array =  " + Arrays.toString(arr) + "\n" + " The maximum is --> " + max + " \n" + " The minimum  is --> " + min);


    }


}
