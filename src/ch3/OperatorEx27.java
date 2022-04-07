package ch3;

public class OperatorEx27 {
    public static void main(String[] args){
        boolean b = true;
        char c = 'C';

        System.out.println(b);
        System.out.println(!b);
        System.out.println(!!b);
        System.out.println(!!!b);

        System.out.println(c < 'a' || c > 'z');
        System.out.println(!(c >= 'a' && c >= 'z'));
        System.out.println(c >= 'a' && c >= 'z');
    }
}
