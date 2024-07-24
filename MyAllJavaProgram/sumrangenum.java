import java.util.Scanner;

public class sumrangenum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("emter the first n number ");
        int a=sc.nextInt();
        Scanner vc=new Scanner(System.in);
        System.out.println("emter the first n number ");
        int b=vc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++)
        sum+=i;
        System.out.println(sum);
        sc.close();
        vc.close();
    }
    
}
