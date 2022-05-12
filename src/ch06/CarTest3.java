package ch6;

class Car3 {
    String color;
    String gearType;
    int door;

    Car3(){
        this("white", " auto", 4);
    }

    Car3(Car3 c){
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car3(String c, String g, int d){
        this.color = c;
        this.gearType = g;
        this.door = d;
    }
}

class CarTest3{
    public static void main(String[] args) {
        Car3 c1 = new Car3();

        Car3 c2 = new Car3(c1);

        c1.door = 2;


    }
}