public class DuplicateNumber {

    public static void main(String[] args) {

        int[] list = {3, 1, 3, 4, 2};
        duplicate(list);
    }

    public static void duplicate(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("the duplicate is " + arr[i]);
                }

            }
        }

    }
}
