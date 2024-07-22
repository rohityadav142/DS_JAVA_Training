import java.util.*;
public class simplecalculator {
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc=new Scanner(System.in) ;
        System.out.println("enter first num");
        a=sc.nextInt();
        Scanner cc=new Scanner(System.in) ;
        System.out.println("enter second num");
        b=cc.nextInt();
        Scanner bc=new Scanner(System.in) ;
        System.out.println("add->1,sub->2,multiply->3,divide->4");
        ch=bc.nextInt();
        if(ch==1)
        System.out.println("answer: "+(a+b));
        else if(ch==2)
        System.out.println("answer: "+(a-b));
        else if(ch==3)
        System.out.println("answer: "+(a*b));
        else if(ch==4)
        System.out.println("answer: "+(a/b));
        bc.close();
        cc.close();
        sc.close();
    }

    
}