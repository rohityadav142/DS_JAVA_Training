import java.util.Scanner;
public class threelargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first num");
        int num1 = sc.nextInt();
        Scanner vc = new Scanner(System.in);
        System.out.print("enter the second num");
        int num2 = sc.nextInt();
        Scanner bc = new Scanner(System.in);
        System.out.print("enter the third num");
        int num3 = sc.nextInt();
        if(num1>num2&&num1>num3)
        System.out.println(num1+"   is greater num");
        else if(num2>num1&&num2>num3)
        System.out.println(num2+"   is greater num");
        else
        System.out.println(num3+"   is greater num");
        // else
        // System.out.println("it is equal num");
        bc.close();vc.close();sc.close();
    }
    
}
