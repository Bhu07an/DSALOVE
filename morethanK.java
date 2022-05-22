//Given an array of size n and a number k, find all elements that appear more than n/k times

import java.util.HashMap;

public class morethanK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,9,1,1,5,5,5,5};

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){

            if( ! map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                int count  = map.get(arr[i]);
               count++;
                map.put(arr[i],count);
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            int freq = map.get(arr[i] );
            if( freq > 3){
                System.out.println("more than 3 frequency is " + arr[i]);
            }

        }

    }
}
