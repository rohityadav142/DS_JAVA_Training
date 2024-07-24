import java.util.Scanner;

public class palindromewhile {
    public static void main(String[] args) {
        int n, rev = 0, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digits");
        n = sc.nextInt();
        z = n;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
             n = n / 10;
        }
        if (rev == z)
            System.out.println("palindrome");//121,131,141,161,717...
        else
            System.out.println("not palindrome");//132,154,156,125,.....
            sc.close();
    }

}
