import java.util.ArrayList;
import java.util.Arrays;

public class PRAC {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};
        int[] arr1 = new int[arr.length + 1];
        System.out.println(Arrays.toString(arr1));

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int temp = arr[i];
            arr1[temp] = (arr1[temp]) + 1;

        }
        System.out.println(Arrays.toString(arr1));


        for (int i = 1; i < arr1.length; i++) {

            if (arr1[i] > 1) {
                list.add(i);
            }
            if (arr1[i] == 0) {
                list.add(i);
            }

        }
        System.out.println(list);
    }
}

//
/*
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        int temp = -1;

        HashMap<Integer ,Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){                    // put all value in hash map if find repeating than increase the frequency and stored in Arrays only one element is repeat in full array

            if( map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i] + 1));
                temp = arr[i];

            }
            else{
                map.put(arr[i] , 1);
            }
        }


        for(int  i = 1 ; i <= n  ;i++){
            if(! map.containsKey(i)){
                ans[0] = temp;
                ans[1] = i;                                          // the elent is from  1 to N
                break;
            }
        }


        return ans;

    }

} */