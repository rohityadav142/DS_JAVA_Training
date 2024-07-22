import java.util.*;
public class pairinarray {
    public static void print_pairs(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int curr=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
public static void main(String[] args) {
    int number[]={2,4,6,8,10};
    print_pairs(number);
}
    
}