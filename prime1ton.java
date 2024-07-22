import java.util.Scanner;
public class prime1ton {
    public static void main(String a[]) {
        int i, count,n,total=0;
        Scanner sc=new Scanner(System.in);
        sc.close();
        System.out.println("ending enter the number");
        n=sc.nextInt();
        System.out.println("starting  enter the number");
        i=sc.nextInt();
        for (;i <= n; i++)//; smiclon ke pahile balnk kerne pr wo intilize ho jata h jo value enter krta h user 
         {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(i);
                total=total+1;
            }
        }System.out.println("total prime numer =" +total);
        sc.close();
    }
}
