public class alphabeticorderinvertpyramid {
    public static void main(String[] args) {
        int n=65;
        for(int i=0;i<26;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(n)+" ");
            }
            n++;
            System.out.println();
        }
    }
    
}
