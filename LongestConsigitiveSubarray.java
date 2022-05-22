import java.util.HashSet;

public class LongestConsigitiveSubarray {
    public static void main(String[] args) {
        int[] list = {1, 9, 3, 10, 4, 20, 2};
        LongestConSSUBSequ(list, list.length);

    }

    public static void LongestConSSUBSequ(int[] arr, int n) {
        int max = 0;
        int maximum = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int j = 0; j < n; j++) {
            if (!set.contains(arr[j] - 1)) {
                int num = arr[j];
                max = 0;
                while (set.contains(num)) {
                    max++;
                    num++;

                }
                maximum = Math.max(maximum, max);


            }
        }
        System.out.println("the maximum is " + maximum);

    }
}
