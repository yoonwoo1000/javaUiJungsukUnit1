package ch04;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args){
        System.out.println("Id no = ");
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();
        char gender = regNo.charAt(7);

        switch (gender){
            case 1: case 3:
                switch (gender){
                    case 1:
                        System.out.println("before 2000 man");
                        break;
                    case 3:
                        System.out.println("after 2000 man");
                        break;
                }
                break;
            case 2: case 4:
                switch (gender){
                    case 2:
                        System.out.println("before 2000 woman");
                        break;
                    case 4:
                        System.out.println("after 2000 woman");
                        break;
                }
                break;
            default:
                System.out.println("no");
        }
    }
}
