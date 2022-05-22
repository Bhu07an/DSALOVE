public class StockMaxPRo {
    public static void main(String[] args){
        int[] list = {90, 80, 70, 60, 50};
        maxprofit(list);
    }
    public static void maxprofit(int[] arr){
        int maxpro = 0 ;
        int sum = 0 ;
        for(int i = 1 ; i < arr.length; i++){
            sum = arr[i] - arr[i-1];
            if( sum > 0){
                maxpro = maxpro + sum;
            }
        }
        System.out.println("maximum profir is the  " + maxpro);
    }
}
