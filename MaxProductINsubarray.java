public class MaxProductINsubarray {
    public static void main(String[] args) {
        int[] list = {-6,-3,10};
        Produte(list);

    }

    public static void Produte(int[] a) {
        int ma = a[0];
        int mi = a[0];
        int ans = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < 0) {

                int temp = ma;
                ma = mi;
                mi = temp;
            }
            ma = Math.max(ma, (a[i]* a[i]));

            mi = Math.min(mi, (a[i] * a[i]));
            ans = Math.max(ma, ans);
        }
        System.out.println(ans);
    }


}
