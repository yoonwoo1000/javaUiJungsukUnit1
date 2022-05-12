package ch6.quiz;

class Mypoint{
    int x;
    int y;

    Mypoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    double getDistance(int x1, int y1){
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
}

public class Ex7 {
    static double getDistance(int x, int y, int x1, int y1){
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }

    public static void main(String[] args) {
        Mypoint m1 = new Mypoint(1,1);

        System.out.println(m1.getDistance(2,2));

        System.out.println(getDistance(1,1,2,2));
    }
}

