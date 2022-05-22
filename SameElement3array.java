import java.util.ArrayList;
import java.util.Arrays;

public class SameElement3array {
    public static void main(String[] args) {
        int[] a = {1, 5, 10, 20, 40, 80};
        int[] b = {6, 7, 20, 80, 100};
        int[] c = {3, 4, 15, 20, 30, 70, 80, 120};
        int a1 = a.length ;
        int b1 = b.length ;
        int c1 = c.length ;
        System.out.println(SameELement(a,b,c,a1,b1,c1));
    }

    public static ArrayList<Integer> SameELement(int[] arr1, int[] arr2, int[] arr3, int a1, int b1, int c1) {

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a1 && j < b1 && k < c1) {

            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                ans.add(arr1[i]);
                int ele = arr1[i];
                while (i < a1 && ele == arr1[i]) {
                    i++;
                }
                while (j < b1 && ele == arr2[j]) {
                    j++;
                }
                while (k < c1 && ele == arr3[k]) {
                    k++;
                }
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }

        }
        return ans;
    }
}