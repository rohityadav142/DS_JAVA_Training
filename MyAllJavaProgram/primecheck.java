import java.util.Scanner;

public class primecheck {
    int n;

    void getdata()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the check prime or not");
        n=sc.nextInt();
        sc.close();
    }

    void putdata()

    {
        int i, count = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0)
                count = count + 1;
        }
        if (count == 2)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }

    public static void main(String[] args) {
        primecheck aa = new primecheck();
        aa.getdata();
        aa.putdata();
}
}