public class binarytodecimal{
    public static void binarytodec(int n){
        int mynum=n;
        int pow=0;
        int dec=0;
        while(n>0){
            int lastdig=n%10;
            dec=dec+(lastdig*(int)Math.pow(2 ,pow));
            pow++;
            n=n/10;
        }
        System.out.println("binary num "+mynum +":="+"the decimal number "+dec);
    } 
    public static void decimaltobin(int n){
    int pow=0;
  int   mynumr=n;
    int binary=0;
    while(n>0){
        int rem=n%2;
        binary=binary+(rem*(int)Math.pow(10,pow));
        pow++;
        n=n/2;
    }
System.out.println("binary no"+mynumr+" "+binary);

    }
    public static void main(String[] args) {
        decimaltobin(5);
    }

    
}
