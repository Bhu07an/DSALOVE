public class SmallerSubArrSumGreat {
    public static void main(String[] args){
        int[] arr = {1,4,45,6,7,19};
        int n = arr.length;
        System.out.println(SumGreatSmalAr(arr,n,51));

    }
    public static int SumGreatSmalAr(int[] arr , int n , int x){
        int start = 0;
        int end = 0;
        int sum =0;
        int minlength = n+1;

        while( end < n){

            while(sum <= x && end < n ){
                sum = sum + arr[end];
                end++;
            }

            while( sum > x && start < n){
                if( end - start < minlength){
                    minlength = end - start;
                }
                sum = sum - arr[start];
                start++;
            }

        }

        return minlength;

    }
}
