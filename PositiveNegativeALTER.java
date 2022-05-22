import java.util.Arrays;

public class PositiveNegativeALTER {
    public static void main(String[] args) {
        int[] list =  {9, 4, -2, -1, 5, 0, -5, -3, 2};
        System.out.println(Arrays.toString(NegToPosrearange(list)));


    }
   public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] NegToPosrearange(int[] list) {
        int i = 0;
        int j = list.length - 1;
        while (i < j) {
                                                           // TO MAKE THE LIST ALL FIRST TO BE POSITIVE AND END NEGATIVE
            if (list[i] > 0 || list[i] ==0) {
                i++;
            } else if (list[j] < 0) {
                j--;
            } else {
                swap(list, i, j);
            }
        }


        int k = 0;
        while (i < list.length && k < list.length) {

            swap(list,i,k);
            k=k+2;
            i++;
        }
        return list;
    }
}
