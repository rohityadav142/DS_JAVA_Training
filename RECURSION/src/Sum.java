public class Sum {
    public static void main(String[] args) {
        int n = 30;
        System.out.println(sumofn(n));

    }

    public static int sumofn(int n) {
        if (n == 1) {
            return 1;
        }
        int sumnm1=sumofn(n-1);
        int sm = n+sumofn(n-1);
        return sm;
    }
}
