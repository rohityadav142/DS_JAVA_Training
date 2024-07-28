package Currencyconverter;

import java.util.Scanner;

public class Currencyconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to currency converter ");
        System.out.println("type 1 : to convert indian to Usd");
        System.out.println("type 2 : to cnvert Usd to Indian");
        System.out.println("type 3 : exit ");
        System.out.println("enter your choice ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                convertindtousd();
                break;
            case 2:
                convertusdtoind();
                break;
            case 3:
                System.out.println("thank you ");
                return;
            default:
                System.out.println(" invalid you are input choice");

        }


    }
    public static void convertindtousd(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the RS to cnvert into USD");
        double inramount=scanner.nextDouble();
        double usdamount= inramount/83.5;
        System.out.println(usdamount);
    }
    public static void convertusdtoind(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the USD to cnvert into INDAIN");
        double usdamount=scanner.nextDouble();
        double inramount = usdamount*83.5;
        System.out.println(inramount);

    }
}