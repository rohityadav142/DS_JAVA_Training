import java.util.*;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        float rad=sc.nextFloat();
        float area=3.14f*rad*rad;
        System.out.println(area);
        sc.close();
    }
    
}
