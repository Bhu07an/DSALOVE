import java.util.Arrays;

public class MinimizeHeight {

    public static void main(String[] args){

        int k = 2;
        int[] height = {1,5,8,10};
        Maxdiff(height,k);

    }

     public static void Maxdiff(int[] arr,int k){

       int Maxdiff;

        for(int i = 0 ; i < arr.length  ; i++){


           if( (arr[i] - k)  <  0 ){

               arr[i] += k;
           }
           else{

               arr[i]  = arr[i] - k;
           }

           }

         System.out.println(Arrays.toString(arr));

         Arrays.sort(arr);

        Maxdiff = arr[arr.length-1]  - arr[0];

         System.out.println("the maximum difference is  " +Maxdiff);

   }

}
