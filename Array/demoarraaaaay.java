public class demoarraaaaay {
    public static void main(String[] args) {
        //String[]name=new String[5];
        String[] name=new String[]{ "Rohit " ,"Anuj ","shashi","kamal","Satyam","wasif"};
        name[2]="babu sona";
//     for (int i = 0; i < name.length; i++) {
//           System.out.println(name[i] +" ");
        for(String i:name)     {
            System.out.println((i)+" ");
        }

        System.out.println(name.length);

    }
}

