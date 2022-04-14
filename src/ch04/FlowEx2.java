package ch04;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args){
        int input;

        System.out.println("num = ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if(input == 0) {
            System.out.println(input);
        }

       if(input != 0) {
            System.out.println(input);
        }
    }
}
