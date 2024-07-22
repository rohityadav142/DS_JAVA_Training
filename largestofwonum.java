import java.util.Scanner;

public class largestofwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num");
        int num1 = sc.nextInt();
        Scanner vc = new Scanner(System.in);
        System.out.println("enter the second num");
        int num2 = sc.nextInt();
        if (num1 == num2)
            System.out.println("number is equal to each other ");
        else if (num1 > num2)
            System.out.println(num1 + "   is greater");
        else
            System.out.println(num2 + "   is greater");
            vc.close();
            sc.close();

    }

}
