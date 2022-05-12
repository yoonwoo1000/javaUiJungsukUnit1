package ch6;

class Car2 {
    String color;
    String gearType;
    int door;

    Car2(){
        this("white", " auto", 4);
    }

    Car2(String color){
        this(color, "auto", 4);
    }

    Car2(String c, String g, int d){
        this.color = c;
        this.gearType = g;
        this.door = d;
    }
}

class CarTest2{
    public static void main(String[] args) {
        Car2 c1 = new Car2();

        Car2 c2 = new Car2("blue");


    }
}