public class HighCountSubARRay {

    public static void main(String[] args) {
        int[] list = {-1,-3};
        int Highest = subarr(list);
        System.out.println("the sum of countigius subaray is  " +Highest );
    }

    public static int subarr(int[] arr) {

        int sum = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + i;

            if (max < sum) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;

            }


        }
        return max;

    }

}
