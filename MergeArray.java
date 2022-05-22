import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {

        int[] list1 = {7,10};
        int[] list2 = {4,8,11};
        merge(list1,list2);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
    }


    public static void swap(int[] arr1, int[] arr2, int i) {
        int temp = arr1[i];
        arr1[i] = arr2[0];
        arr2[0] = temp;
    }


    public static void merge(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] > arr2[0]) {
                swap(arr1, arr2, i);
            }

            if (arr2[0] > arr2[1]) {

                int temp = arr2[0];
                arr2[0] = arr2[1];
                arr2[1] = temp;

            }

        }

    }

}
