package ch6.quiz;

// Ex 18
public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //static int cv2 = iv; // satic 변수에서 인스턴스 사용 불가

    static void staticMethod1 (){
        System.out.println(cv);
      //  System.out.println(iv); satic 변수에서 인스턴스 사용 불가
    }


    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2(){
        staticMethod1();
        //instanceMethod1(); static 에서 인스턴스 사용 불가
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
