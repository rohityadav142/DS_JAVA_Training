//for finding the factorial by the function.....
//is se hum factorial find kr sakte h .......
public class factorialbyfunction {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i; 
        }
        return f; // yaha pr factorial ka logic return huaa hai 
    }
    // is function hum bionomial find kr skte h ....
    public static int bionocoffe(int n ,int r){
        int fact_n=factorial(n);/// yaha pr pahile factorial find hua  hai 
        int fact_r=factorial(r);// same kaam yaha bhi
        int fact_nmr=factorial(n-r);// same as 
        int bionocoffe=fact_n/(fact_r*fact_nmr);/// ye to lofic ya formula hai jo ki bionomial find krte hai 
        return bionocoffe; // yaha pr bhi bionomial ka logic return huaa hai 

    }

    public static void main(String[] args) { // jaha se  main function chalu hota wahi value display hoti hai .. 
        System.out.println(" the factorial of given number:= "+factorial(6));// pahile factorial function call hua  hai 
        System.out.println(" binomial of the given two number :="+bionocoffe(8,5));// yaha pr bionomial coffencent function call  hua hai 
    }
}
