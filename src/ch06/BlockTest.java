package ch6;

import java.sql.SQLOutput;

public class BlockTest {
    static {
        System.out.println("static");
    }

    {
        System.out.println("{   }");
    }
    public BlockTest(){
        System.out.println(" todtjdwk");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest");
        BlockTest bk = new BlockTest();

        System.out.println("BlockTest2");
        BlockTest bk2 = new BlockTest();
    }
}
