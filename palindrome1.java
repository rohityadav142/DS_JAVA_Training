/**
 * palindrome1
 */
public class palindrome1 {

    public static void main(String[] args) {
        int num=12321,temp,rem,reverse=0;
        temp=num;
        while(temp!=0){
            rem=temp%10;
            reverse=reverse *10 +rem;
            temp=temp/10;
        };
        if(num==reverse)
        System.out.println(num+"palindrome");
        else
        System.out.println(num+"is not palindrome");

    }
}