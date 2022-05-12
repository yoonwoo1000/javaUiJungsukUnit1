package ch6;

public class OverloadingTest {
    public static void main(String[] args) {
        Mymath3 mm = new Mymath3();
        System.out.println(mm.add(3,3));
        System.out.println(mm.add(3l,3));
        System.out.println(mm.add(3,3l));
        System.out.println(mm.add(3l,3l));

        int a[] = {10, 20, 30};
        System.out.println(mm.add(a));
    }
}

class Mymath3{
    int add(int a, int b){
        System.out.println("int add(a, b)");
        return a+b;
    }
    long add(int a, long b){
        System.out.println("long add");
        return a+b;
    }

    long add(long a, int b){
        return a+b;
    }
    long add(long a, long b){
        return a+b;
    }

    int add(int[] a){
        int result =0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
