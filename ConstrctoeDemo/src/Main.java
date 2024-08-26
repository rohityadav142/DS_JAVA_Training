//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Myclass myclass = new Myclass(5,8);
        System.out.println("C="+myclass.c);
        System.out.println("D="+myclass.d);


    }
}

class Myclass {
    //parameter constructor
    public Myclass(int a, int b) {
        c = a;
        this.d = b;
        System.out.println(a + b);
    }

    int c, d;

    public Myclass(String fname, String lname)
    {
    }
}
