public class practicereverse {
    public static int  reverse(int num) {
        int rev=0;
        while (num>0) {
            int rem = num % 10; 
            rev = (rev * 10) + rem;
            num = num/10;
        }
        return(rev);
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}