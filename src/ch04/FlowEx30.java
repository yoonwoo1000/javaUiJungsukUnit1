package ch04;

import java.util.Scanner;

public class FlowEx30 {
    public static void main(String[] args){

        int sum = 0;
        int i = 0;

        while (true){
            if(sum>100)
                break;
            ++i;
            sum+=i;
        }

        System.out.println(i);
        System.out.println(sum);

    }
}
