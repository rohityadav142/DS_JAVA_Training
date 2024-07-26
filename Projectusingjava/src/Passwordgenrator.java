
import java.util.*;

public class Passwordgenrator {
    public static void main(String[] args) {
        //to generate 6 digit otp random class used
        int length;
        Random random = new Random();

        //String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstu vwxyz0123456789~`!@#$%^&*()-_=+[{]}|;:,<.>/?";
        double myOtp=random.nextDouble();
        System.out.println("Your Java OTP is: "+"   "+ myOtp+" don't share to anyone");

}}
//Random@5f184fc6