package ch04;

public class Ex12 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i += 3) {
            for (int j = 1; j <= 3; j++) {

                printGo(i, j);
                printGo(i + 2, j);
                printGo(i + 1, j);

                System.out.println();



            }
        }
    }
    static void printGo(int x, int y)
    {
        if(x <=9)
        {
            System.out.printf("%d * %d = %d\t", x, y, x * y);
        }
    }

}
