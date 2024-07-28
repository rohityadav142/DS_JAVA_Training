import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {
     RectangleofArea();
    }
    public static void RectangleofArea(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int l=sc.nextInt();
        System.out.println("Enter the breadth");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println(" The area of Rectangle is: "+area);
    }
}
