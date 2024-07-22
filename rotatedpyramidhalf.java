public class rotatedpyramidhalf {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){// for rows
              for(int k=1;k<=n-i;k++){
                    System.out.print(" ");// for space
                }
                for(int j=1;j<=i;j++){//for column
                    System.out.print("1");
                }
            System.out.println( );
        }
    }
}
