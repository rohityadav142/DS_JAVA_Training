import java.util.Arrays;

public class sortStringdemo {
    public static void main(String[] args) {
        String[] array2={"mohan" ,"mohit","aman","anju","madhvi","priyanka","binod","rohit","wasif","somit"};

        for (int i = 0; i <array2.length; i++) {
            Arrays.sort(array2);

        }
        System.out.println(Arrays.toString(array2));
    }
}
