import java.util.Arrays;
import java.util.Scanner;

class RainWaterProblem {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);                     // input fro mthe user
        System.out.println("total number of element");
        int g = scan.nextInt();
        int[] block = new int[g];
        for(int i = 0 ; i < g ; i++){
            System.out.println("entre the " + (i+1) +" value");
            block[i] = scan.nextInt();
        }

        int n = block.length;
        System.out.println(Droplet(block, n));
    }

    public static long  Droplet(int[] arr, int n) {
        int[] rightHighest = new int[n];
        int[] leftHighest = new int[n];

        int leftTemp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            leftHighest[i] = Math.max(arr[i], leftTemp);
            leftTemp = leftHighest[i];
        }


        int rightTemp = arr[n-1];
        for(int j = n-1 ; j >= 0; j--){
            rightHighest[j] = Math.max(rightTemp,arr[j]);
            rightTemp = rightHighest[j];
        }


         long count = 0;
        for(int k = 0; k < arr.length ; k++){
             count  =  count + Math.min(rightHighest[k] , leftHighest[k]) - arr[k];

        }
        return count;
    }
}