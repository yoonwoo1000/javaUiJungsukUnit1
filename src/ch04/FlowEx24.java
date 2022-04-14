package ch04;

import java.util.Scanner;

public class FlowEx24 {
    public static void main(String[] args){

        int i = 11;

        System.out.println(" count");

        while(i--!=0){
            System.out.println(i);

            for (int j = 0; j<2000000000;j++){
                ;
            }
        }
        System.out.println("Game over");
    }
}
