package ch6;

class MyMath2 {
    long a, b;

    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }
    long multiply() {return a*b;}
    long divide(){return a/b;}

    static long add(long a, long b) {
        return a + b;
    }
    static long subtract(long a, long b) {
        return a - b;
    }
    static long multiply (long a, long b) {
        return a * b;
    }

    static long divide(long a, long b) {
        return a / b;
    }


}
class MyMathTest2 {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(200l,100l));
        System.out.println(MyMath2.divide(200l,100l));
        System.out.println(MyMath2.subtract(200l,100l));
        System.out.println(MyMath2.multiply(200l,100l));

        MyMath2 mm = new MyMath2();
        mm.a = 200l;
        mm.b = 100l;

        System.out.println(mm.add());
        System.out.println(mm.divide());
        System.out.println(mm.multiply());
        System.out.println(mm.subtract());
    }
}
