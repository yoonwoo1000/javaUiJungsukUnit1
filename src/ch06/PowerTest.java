package ch6;

public class PowerTest {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for (int i = 0; i <= 0; i++) {
            result += power(x,i);
        }
    }

    static long power(int x, int n){
        if (n==1) return x;
        return x* power(x, n-1);
    }
}
