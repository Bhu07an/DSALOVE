import java.util.Arrays;

public class permutation {

    public static void main(String[] args) {

        int[] list = {1,2,3,6,5,4};
        Permu(list);

    }



    public static void swap(int[] arr, int i, int j) {
                                                                               /// SWAP FUNCTION
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }



    public static void reverse(int[] arr, int start) {

        int last = arr.length - 1;

        for( int  i  = start ; i < last ; i++){
                                                                            /// REVERSE ARRAY
            swap(arr, i, last);
             last--;
        }

    }



    public static void  Permu( int[] arr){

        int i = 0;
        int max =0;
        int min =0;

        for(  i = arr.length -1;  i > 0; i--){

          if( arr[i-1] < arr[i] ){

              min  =  arr[i-1];
              max  =  arr[i];
              break;

          }

        }


        if( max ==0 ){

            reverse(arr,0);

        }


        else{

            for( int j = i+1 ;  j < arr.length ; j++){

                if( arr[j] < max && arr[j] > min){

                    swap(arr,i-1,j);
                    break;

                }

            }

            reverse(arr,i);

        }

        System.out.println(Arrays.toString(arr));
    }

}
