package ch02;

public class CharToCode {
    public static void mian(String[] args){
        char ch = 'A';
        int code = (int)ch;

        System.out.printf("%c=%d(%#X) %n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X) %n", hch, (int)hch, (int)hch);

    }
}
