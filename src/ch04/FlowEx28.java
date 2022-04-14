package ch04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args){
        int input = 0, answer = 0;
        answer = (int)(Math.random() *100) + 1;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("1 - 100");
            input = scanner.nextInt();

            if(input >answer){
                System.out.println("less num");
            }
            else if(input<answer){
                System.out.println("big");
            }
        }while (input != answer);
            System.out.println("yes ");

    }
}
