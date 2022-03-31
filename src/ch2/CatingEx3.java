package ch2;

public class CatingEx3 {
    public static void mian(String[] args){
        float f = 9.123456f;
        double d = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f = %20.18f\n", f);
        System.out.printf("d = %20.18f\n", d);
        System.out.printf("d2= %20.18f\n", d2);
    }
}
