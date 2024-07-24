public class gridArray {
    public static void main(String[] args) {
        int[][] array=new int[10][10];
        for (int i = 1; i <array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                System.out.print(" "+ array[i][j]);
            }
            System.out.println();

        }
        System.out.println(array.length);
    }
}
