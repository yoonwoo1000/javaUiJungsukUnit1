package ch04;
import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args){

        int score = 0;
        char grade = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.println("score = ");

        score = scanner.nextInt();

        if(score<= 90){
            grade = 'A';
        }
        else if(score<= 80){
            grade = 'B';
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
