public class strings {
    public static void  letterprint(String str){
        for(int i=0;i<=str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String firstname="Rohit";
        String lastname="Yadav";
        String fullname=firstname+" "+ lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        letterprint(fullname);
    }
    
}
