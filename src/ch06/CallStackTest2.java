package ch06;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main args start");
        firstMethod();
        System.out.println("main args end");
    }
    static void firstMethod(){
        System.out.println("first start");
        secondMethod();
        System.out.println("first end");
    }
    static void secondMethod(){
        System.out.println("second start");
        System.out.println("second end");
    }

}
