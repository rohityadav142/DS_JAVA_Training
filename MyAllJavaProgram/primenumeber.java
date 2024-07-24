import java.util.*;
public class primenumeber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();sc.close();
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0)
                count = count + 1;
        if (count == 2)
            System.out.println("it is prime number");
        else
            System.out.println("is not prime");
    }
}