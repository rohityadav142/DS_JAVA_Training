public class avarage {
    public static void main(String[] args) {
        int[] array1={1,7,9,11,12};
        int sum=0;
        int n = array1.length;
        for (int i = 0; i < array1.length; i++) {
            sum=sum+array1[i];
        }
        double avg=sum/ array1.length;
        System.out.println(avg);
    }
}
