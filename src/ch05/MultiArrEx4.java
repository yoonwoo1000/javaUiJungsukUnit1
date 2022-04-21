package ch05;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair","Uiza"},
                {"computer","computer"},
                {"integer","jungsu"}
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])){
                System.out.println("yes");
            }else{
                System.out.println("nope");
            }
        }
    }
}
