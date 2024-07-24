import java.util.Arrays;
public class Sortingarraydemo {
    public static void main(String[] args) {
        int[] array1 = {
                1734, 1552, 2250, 7890, 8840, 8596, 1111, 1000, 1001
        };
        for (int i = 0; i <= array1.length; i++) {
            Arrays.sort(array1);


        }
        System.out.println(Arrays.toString(array1));
    }}
