import java.util.*;

public class questionapnacollege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter your number");
            int number = sc.nextInt();
            if (number % 10 == 0) {
                System.out.println("the multiple of 10");
                break;
            }

        } while (true);
        sc.close();
    }

}
