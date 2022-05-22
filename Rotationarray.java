import java.util.Arrays;

public class Rotationarray {

    public static void main(String[] args){

        int[] list  = {1,2,3,4,5,6};
        rotate(list);
        System.out.println(Arrays.toString(list));

    }

    public static void rotate(int[] arr){

        int last =  arr[arr.length-1];

        for( int i = arr.length -1; i > 0 ; i--){

            arr[i] =  arr[i-1];

        }

        arr[0] =  last;

    }

}
