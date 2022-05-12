package ch6.quiz;

public class Ex23 {
    public static int mas(int[] arr) {
        int max = 0;
        if(arr==null || arr.length==0){
            max = -999999;
        }
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] > arr[0]){
                int tmp = arr[0];
                arr[0] = arr[i];
                arr[i] = tmp;
            }

            max = arr[0];
        }

        return max;
    }
}
