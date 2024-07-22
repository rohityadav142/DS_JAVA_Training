import java.util.Scanner;
public class sumfirstnnum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("emter the first n nuumber ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        sum+=i;
        System.out.println(sum);
        sc.close();
    }
       
    
}
