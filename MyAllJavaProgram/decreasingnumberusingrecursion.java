public class decreasingnumberusingrecursion {
    public static void  Printdec(int n){
        if (n == 1){
           System.out.println(1);
       }else{

       
            System.out.print(n+" ");
            Printdec(n-1);
            return;
            }}
            public static void  Printinc(int n){
                if (n == 1){
                   System.out.print(1+" ");
               }else{
        
                Printinc(n-1);
                    System.out.print(n + " ");
                    
                    return;
                    }
                }
    public static void main(String[] args) {
        int n=10;
        Printinc(n);
        System.out.println();
        Printdec(n);

        }
    }
