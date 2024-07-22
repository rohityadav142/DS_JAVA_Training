
public class palindrome {

    public static void main(String[] args) {
        String char0 = "Rohit Yadav";
        String char1 = char0.toLowerCase();
        char[] char2 = char1.toCharArray();
        for (int i =(char2.length)-1 ; i >=0; i--) {
            char char3 = char2[i];
            System.out.print(char3);
        }

    }
}