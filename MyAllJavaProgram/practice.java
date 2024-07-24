import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the num ");
        int n = sc.nextInt();
        int counter = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                counter++;
        if (counter == 2)
            System.out.println("prime");
        else
            System.out.println("not prme ");
sc.close();
    }
}
