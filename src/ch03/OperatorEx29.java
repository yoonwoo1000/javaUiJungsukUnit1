package ch03;

public class OperatorEx29 {
    public static void main(String[] args){
        byte p = 10, n = -10;

        System.out.printf("%#X /t/t%s%n", p, toBinaryString(p));
        System.out.printf("%#X /t/t%s%n", ~p, toBinaryString(~p));
    }


    static String toBinaryString(int x){
        String zero = "00000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length()-32);
    }

}