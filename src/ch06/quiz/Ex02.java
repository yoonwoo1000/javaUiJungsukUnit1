package ch6.quiz;

public class Ex2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "hong";
        student.ban = 1;
        student.no = 1;
        student.eng = 100;
        student.kor = 70;
        student.mth = 40;
        Student student1 = new Student("hong", 1,1,100,50,56);

        System.out.println(student.name);
        System.out.println(student.getTotal());
        System.out.println(student.getAverage());

        System.out.println(student1.info());
    }
}

class Student{
    String name;
    int no;
    int ban;
    int kor;
    int eng;
    int mth;

    Student(String name, int ban, int no, int kor, int eng, int mth){
        this.name = name;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.mth = mth;
    }

    Student(){}

    int getTotal(){
        return kor + eng + mth;
    }

    float getAverage(){
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }

    public String info()
    {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+mth
                +","+getTotal()
                +","+getAverage();
    }
}
