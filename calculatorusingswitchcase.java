import java.util.*;

public class calculatorusingswitchcase {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a:");
        int a = sc.nextInt();
        System.out.println("enter the number b:");
        int b = sc.nextInt();
        System.out.println("enter the operator:");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
            default:
                System.out.println("we are sorry u are enter wrong operator ");
                sc.close();
        }
    }

}
