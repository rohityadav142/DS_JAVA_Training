import java.util.Scanner;

public class checkpostiveandnegativno {

    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        if(num>0)
        System.out.println("the num is positive");
        else if(num<0)
        System.out.println("num is negative ");
        else
        System.out.println("equal to zero");
        sc.close();

    }
 

    }

