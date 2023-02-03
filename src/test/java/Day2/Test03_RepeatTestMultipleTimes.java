package Day2;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_RepeatTestMultipleTimes {

    // !!! Testi tekrarlatmak istiyorsam ???
    @RepeatedTest(5)
    void testSubString(){
        assertEquals("Java", "Java çok güzel".substring(0,4));
        System.out.println("testSubString() çalıştı");
    }

    @RepeatedTest(3)
    void testRepeated(){
        assertEquals(2, Math.addExact(1, 1));
    }

    // 3.Örnek
    Random rm = new Random();
    @RepeatedTest(5)
        //@Disabled
    void TestMathAddExact(){
        int sayi1 = rm.nextInt(10);
        int sayi2 = rm.nextInt(10);
        assertEquals(sayi1+sayi2,Math.addExact(sayi1,sayi2));
        System.out.println("sayi1 : " + sayi1 + " sayi2 = "+ sayi2);
    }


}
