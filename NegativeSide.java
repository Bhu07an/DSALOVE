import java.util.Arrays;

public class NegativeSide {
    public static void main(String[] args) {

        int[] list = {-12, 5, -9, -4, 25, 44, 12, -21};
        int[] negativelist = negativeElement(list);
        System.out.println(Arrays.toString(negativelist));
    }


    public static int[] negativeElement(int[] arr) {

        int j = 0;
        int temp;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] < 0) {

                if (i != j) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }

                 j++;
            }


        }

        return arr;


    }

}
