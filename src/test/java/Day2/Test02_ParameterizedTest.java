package Day2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_ParameterizedTest {

    @Test
    void testLength() {
        assertTrue("Mirac".length()>0);
        assertTrue("Osman".length()>0);
        assertTrue("Şeyma".length()>0);
        assertTrue("Beyza".length()>0);
        assertTrue("Ömer".length()>0);
    }

    // daha kullanıslı olan parametreli test metodumuzu yazıyoruz
    @ParameterizedTest
    @ValueSource(strings = {"Mirac","Osman","Şeyma","Beyza","Ömer"})
    void testLength2(String str){
        assertTrue(str.length()>0);

    }

    // !!! Başka bir Örnek
    @Test
    void testUpperCase() {
        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        assertEquals("MERHABA", str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }

    //coma-seperated özelliğini kullanıyorum
    @ParameterizedTest
    void testUpperCase2(String str1, String str2) {
        assertEquals(str1,str2.toUpperCase());

    }

    // 3.Örnek

    /*
    java    --> a   ----> assertTrue(contains)
    junit   --> u   ----> assertTrue(contains)
    hello   --> a   ----> assertFalse(contains)
    */
    @ParameterizedTest
    void testContains(boolean b1, String s1, String s2){

        assertEquals(b1 , s1.contains(s2));

    }
}
