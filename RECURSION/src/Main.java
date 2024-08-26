import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value");
       long n= scanner.nextLong();
        printDec(n);
    }

    public static void printDec(long n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");// agar value jo hai 1 ke equal nhi  hoga tab ye
        //uper wala line main function mai jo N ki value wo print karega. ur uske baad 1 se decrease ho jayega
        // agar hoga equal to 1 ke tab ye if ke andar ka value jo ki 1 ke eqaul ho gya ho ga usi return kar dega
        printDec(n - 1);
    }
}

