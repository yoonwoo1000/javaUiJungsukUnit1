package ch04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args){

        int num, sum = 0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" num = ");

        while (flag){
            System.out.print(">>");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if(num!=0){
                sum += num;
            }
            else{
                flag = false;
            }
        }
        System.out.println(sum);
    }
}
