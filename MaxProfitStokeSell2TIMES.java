import java.util.Arrays;

public class MaxProfitStokeSell2TIMES {
    public static void main(String[] args) {
        int[] arr = {10, 22, 5, 75, 65, 80};
        int n = arr.length;
        System.out.println( Maxprofit2sell(arr, n) );

    }

    public static int Maxprofit2sell(int[] arr, int n) {           // left to right sell of each day with and storing maximum profit till now
        int minsofar = arr[0];                                        // to store minimum till now
        int[] lefttoright = new int[n];                                // to store maximum profit till now if sold the stock


        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minsofar) {                         /// if find minimum than minsofar in array so swap
                  minsofar = arr[i];
            }

            int sum = arr[i] - minsofar;                 // finding difernce (solding recent stock with minsofar)

            if( sum > lefttoright[i-1]){                     // checking  for to put in left to right aray with maximum profit till now
                lefttoright[i] = sum;
            }
            else{
                lefttoright[i] = lefttoright[i-1];
            }

        }


        int maxsofar1 = arr[n-1];                        //  right to left sell of each day with and storing maximum profit till now
        int[] righttoleft = new int[n];

        for(int i = n-2 ; i >=  0 ; i--){

            if(arr[i] > maxsofar1){
                maxsofar1 = arr[i];
            }

            int sum  =  maxsofar1 - arr[i];

            if(sum > righttoleft[i+1]){
                righttoleft[i] = sum;
            }
            else{
                righttoleft[i] = righttoleft[i+1];
            }
        }

        for(int i = 0 ; i < n ; i++){
            arr[i] = lefttoright[i] + righttoleft[i];
        }
        Arrays.sort(arr);
        return arr[arr.length-1];

    }

}
