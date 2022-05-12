package ch6;

import javax.print.Doc;

class Document {
    static int count = 0;
    String name;

    Document(){
        this("no title" + ++count);
    }

    Document(String name){
        this.name = name;
        System.out.println("document" + this.name);
    }
}
public class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("java.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
