import java.util.Scanner;
public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number ");
        int num=sc.nextInt();
        int rem, reverse = 0;
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse " + reverse);
        sc.close();

    }
}
