package ch04;

public class FlowEx22 {
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50};
        int sum = 0;

        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        for(int tmp : arr)
        {
            System.out.println(tmp);
            sum += tmp;
        }
        System.out.println("sum = " + sum);

    }
}
