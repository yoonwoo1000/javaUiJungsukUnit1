package ch6.quiz;
import java.lang.reflect.Array;
import java.util.*;

public class Ex20 {

    public static int[] shuffle(int[] sArr){
        for (int i = 0; i < sArr.length; i++) {
            int j = (int)(Math.random() * sArr.length);

            int tmp = sArr[i];
            sArr[i] = sArr[j];
            sArr[j] = tmp;
        }

        return sArr;
    }


    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9,};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(original));
    }
}
