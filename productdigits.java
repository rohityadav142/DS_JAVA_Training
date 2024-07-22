import java.util.Scanner;

public record productdigits() {
    public static void main(String args[]) {
        int n, pro = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digits");
        n = sc.nextInt();
        while (n > 0) {
            pro = pro * (n % 10);
            n = n / 10;
        }
        System.out.println("product" + pro);
        sc.close();
    }
}
