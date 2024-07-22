import java.util.*;

public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the obtained number ");
        int number = sc.nextInt();
        String reportcard = (number >= 33) ? "pass" : "fail";
        System.out.println(reportcard);
        sc.close();
    }

}
