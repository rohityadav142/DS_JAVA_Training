import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the num");
        int num=sc.nextInt();
        if(num%2==0)
        System.out.println("is even num");
        else
        System.out.println("is odd num");
        sc.close();
    }
    
}
