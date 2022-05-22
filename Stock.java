public class Stock {

    public static void main(String[] args){
        int[] pricelist = {7,6,4,3,1};           // {3,1,4,8,7,2,5};          // TEST CASES
        maxvalue(pricelist);
    }

    public static void maxvalue(int[] arr){
        int minsofar = arr[0];
        int maxprofit = 0;

        for(int i = 0 ; i < arr.length-1 ; i++){

            if( minsofar > arr[i] ){
                minsofar = arr[i];
            }

            int temp  = arr[i] - minsofar;
            if(temp > maxprofit){
                maxprofit = temp;
            }

        }
        System.out.println("the maximum profit is " + maxprofit);
    }
}