public class RecursionIncreasing {
    public static void main(String[] args) {
        int n = 1;
        printIncre(n);

    }

    public static void printIncre(int n) {
        if (n == 10) {
            System.out.print(n+" ");
            return;

        }

        System.out.print(n + " ");
        printIncre(n+1);
    }

}
