public class pyramid1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++)
                System.out.print(" ");
            {
                for (int j = 1; j <= 2 * i - 1; j++)
                    System.out.print(i);
            }
            System.out.println();
        }
        n = n - 1;
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= i; k++)
                System.out.print(" ");
            {
                for (int j = 1; j <= 2 * (n - i) + 1; j++)
                    System.out.print(i);
            }
            System.out.println();
        }
    }
}
