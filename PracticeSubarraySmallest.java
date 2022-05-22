public class PracticeSubarraySmallest {
    public static void main(String[] args){
        int[] arr = {1,4,46,6,0,19};
        int x = 51;
        int result =  SmallestSubArray(arr,x,arr.length);
        System.out.println(result);
    }
    public static int SmallestSubArray(int[] arr, int x, int n){

        int i = 0;
        int j = 0;
        int sum = 0;
        int minvalue = Integer.MAX_VALUE;

        while(j < n ){

            while(sum <= x && j < n){
                sum = sum + arr[j];
                j++;

            }

            while(sum > x && i < j){
                minvalue = Math.min( minvalue , (j - i ));
                sum  = sum - arr[i];
                i++;
            }
        }
        return minvalue;
    }
}
