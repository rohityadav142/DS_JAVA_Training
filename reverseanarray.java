import java.util.*;

public class reverseanarray {
    public static void reverse(int number[]) {
        int first = 0, last = number.length - 1;
        while (first < last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            last--;
            first++;
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10,12,16,18,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34, };
        reverse(number);
        for (int i = 0; i <=number.length - 1; i++) {
            System.out.print(number[i] + " ");

        }
        System.out.println();
    }
}