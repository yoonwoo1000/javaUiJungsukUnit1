package ch04;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args){

        System.out.println(" ID number = ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);

        switch (gender){
            case '1': case '3':
                System.out.println("male");
                break;
            case '2': case '4':
                System.out.println("female");
                break;
            default:
                System.out.println("no");
        }
    }
}
