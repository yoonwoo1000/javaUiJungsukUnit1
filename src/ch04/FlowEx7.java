package ch04;
import java.util.*;

public class FlowEx7 {
    public static void main(String[] args){
        System.out.println("1,2,3 = ");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int com = (int)(Math.random() * 3) +1;

        switch (user-com) {
            case 2: case -1:
                System.out.println("lose");
                break;
            case 1: case-2:
                System.out.println("win");
                break;
            case 0:
                System.out.println("same");
                break;
        }
    }
}
