package ch04;

import java.util.Scanner;

public class FlowEx15 {
    public static void main(String[] args){

        System.out.printf("i \t 2*i \t 2*i-1 \t i*i \t 11=i \t i%3 \t i/3");
        System.out.println("---------------------------------------------");

        for(int i = 1; i <= 10 ; i++){
            System.out.println(i + 2*i + 2*i-1 + i*i + 11-i + i%3+ i/3);
        }

    }
}
