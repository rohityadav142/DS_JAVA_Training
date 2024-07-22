import java.util.Scanner;

public class armstrongnum {
   public static void main(String[] args) {
      int n, z, count = 0, digit, pro,sum=0;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number ");
      n = sc.nextInt();
      z = n;
      while (z > 0) {
         count = count + 1;
         z = z / 10;
         z = n;pro=1;
         while (z > 0) {
            digit = z % 10;
            for(int i=1;i<=count;i++)
            pro=pro*digit;
            sum=sum+pro;
            z=z/10;}
            if(sum==n)
            System.out.println("armstong ");
            else
            System.out.println("not armstong");
         }
sc.close();
      }
   }
