package ch3;

public class OperatorEx31 {
    public static void main(String[] args){
        int dec = 1234;
        int hex = 0XABCD;
        int mask = 0XF;

        System.out.println(hex & mask);

        hex = hex >>4;
        System.out.println(hex & mask);

        hex = hex >>4;
        System.out.println(hex & mask);

        hex = hex >>4;
        System.out.println(hex & mask);
    }
}
