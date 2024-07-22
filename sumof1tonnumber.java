import java.util.Scanner;
public class sumof1tonnumber {
    public static void main(String args[]){
 
        Scanner sc=new Scanner(System.in);
        int n,i=1,add=0;
        System.out.println("enter the number ");
        n=sc.nextInt();
        while (i<=n) {
            add=add+i;
            i=i+1;
            System.out.println("add="+add);
            
        }
        sc.close();
        

    }

}
