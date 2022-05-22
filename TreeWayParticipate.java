public class TreeWayParticipate {
    public static void main(String[] args) {

    }

    public void threeWayPartition(int arr[], int a, int b) {
        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i <= right; i++) {

            if (arr[i] < a) {

                swap(arr, i, left);
                left++;
            }

            if (arr[i] > b) {
                swap(arr, i, right);
                right--;
                i--;
            }
      }
  }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
