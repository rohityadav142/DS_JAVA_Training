/**
 * pyramid
 */
public class pyramid {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <=n-i; k++)
                System.out.print(" ");
            {
                for (int j = 1; j<=2*i-1; j++)
                    System.out.print("*");
            } System.out.println();
        }
    }
}
