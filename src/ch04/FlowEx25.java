package ch04;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args){

        int num = 0, sum = 0;
        System.out.println("number = ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while(num!=0){
            sum += num%10;
            System.out.println(sum + num);

            num /= 10;
        }

    }
}
