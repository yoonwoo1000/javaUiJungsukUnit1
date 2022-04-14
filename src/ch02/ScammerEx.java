package ch02;

import java.util.*;

public class ScammerEx {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("two num :");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println(input);
        System.out.printf("num=%d%n", num);
    }
}
