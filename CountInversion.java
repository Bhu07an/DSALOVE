public class CountInversion {

    public static void main(String[] args){

          int[] list  = {2,4,1,3,5};
          Invrsion(list);


    }

    public static void Invrsion( int[] arr){

        int count = 0;                                                         // time complexity = O(N2)

        for( int i = 0 ; i < arr.length -1 ; i++){

            for( int j = i+1; j < arr.length ; j++){

                if( arr[i]  > arr[j] ){

                    count++;

                    System.out.println("(" +arr[i]+  " " +arr[j]+")");

                }

            }

        }

        System.out.println("the count inversion is  " + count );
    }


}
