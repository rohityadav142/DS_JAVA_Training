public class avaragefindinarray {
    public static void main(String[] args) {
        int[] array1={1,7,9,11,12};
        int sum=0;
        for (int i = 1; i <= array1.length; i++) {
            sum=sum+i;
        }
        double avg=sum/array1.length;
        System.out.println(avg);
    }
}
