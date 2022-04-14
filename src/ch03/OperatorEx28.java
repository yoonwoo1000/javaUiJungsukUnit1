package ch03;

public class OperatorEx28 {
    public static void main(String[] args){
        int x = 0XAB, y = 0XF;

        System.out.printf("%#X /t/t%s%n", x, toBinaryString(x));
        System.out.printf("%#X /t/t%s%n", x, toBinaryString(y));
    }


    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }

}
