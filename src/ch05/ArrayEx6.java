package ch05;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {100,88, 100, 100, 90};

        int max = score[0];
        int min = score[0];

        for (int i = 1; i < score.length; i++) {
            if(score[i] > max){
                max = score[i];
            }else if(score[i] < min){
                min = score[i];
            }
        }
    }
}
