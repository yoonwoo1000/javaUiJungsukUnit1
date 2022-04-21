package ch04;

import java.sql.SQLOutput;

public class Ex14 {
    public static void main(String[] args)
    {

        int answer = (int)(Math.random() * 100) +1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기위한 변수

        java.util.Scanner s = new java.util.Scanner(System.in);
        do {
            count++;
            System.out.print("1 과 100사이의 값을 입력하세요");
            input = s.nextInt();

            if(input == answer)
            {
                System.out.println("OK");
                System.out.println(count);
                break;
            }else if(input >= answer) {
                System.out.println("down");
            }else if(input <= answer){
                System.out.println("up");
            }

        } while(true); // 무한반복문
    } // end of main
} // end of class HighLow
