package ch04;

import java.util.Scanner;

public class FlowEx29 {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);


            int tmp = i;

            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0)
                    System.out.println("WKr");
            } while ((tmp /= 10) != 0);
            System.out.println();

        }
    }
}
