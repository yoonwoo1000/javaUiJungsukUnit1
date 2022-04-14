package ch04;
import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args){


        int score = 0;
        char grade = ' ', opt = '0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("score = ");

        score = scanner.nextInt();

        if(score<= 90){
            grade = 'A';
            if(score>=98){
                opt = '+';
            }
            else if( score < 94){
                opt = '-';
            }
        }
        else if(score<= 80){
            grade = 'B';
            if(score>=88){
                opt = '+';
            }
            else if( score < 84){
                opt = '-';
            }
        }
        else if(score<= 70){
            grade = 'C';
        }
        else{
            grade = 'D';
        }

        System.out.println("grade = " + grade);

    }


}
