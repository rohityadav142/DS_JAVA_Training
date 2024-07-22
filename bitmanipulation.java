
public class bitmanipulation {
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("it is even number");
        }else{
System.out.println("it is odd number");
        }
    }
    public static void main(String[] args) {
        oddoreven(3);
        oddoreven(9);
        oddoreven(12);
    oddoreven(17);
        // System.out.println(5&6);//AND 
        // System.out.println(5|6);//OR
        // System.out.println(~5);// NOT
        // System.out.println(5^6);//EXOR
        // System.out.println(5<<2);// LEFT SHIFT 
        // System.out.println(6>>1);//RIGHT SHIFT
    }
    
}
