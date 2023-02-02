package Day1;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {

    // !!! Başlangıçta testin ihtiyaç duyduğu dataya ilk değerlerini vermek için kullanılır

    String str ;

    @BeforeEach
    void beforeEach(){
        str = "Junit5 ile test yazmak çok kolay";
        System.out.println("beforeEach() çalıştı");
    }

    @AfterEach
    void afterEach(){
        str="";
        System.out.println("afterEach() çalıştı");
    }

    @Test
    void testArrays( TestInfo info){
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"Junit5", "ile", "test", "yazmak", "çok", "kolay"};
        System.out.println(info.getDisplayName() + " çalışdı");
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }

    @Test
    void testStringLength( TestInfo info ){
        int anlikDeger = str.length();  // str =" ";
        int beklenenDeger = 32 ;

        assertEquals(beklenenDeger,anlikDeger);
        System.out.println(info.getDisplayName() + " çalıştı");

    }

}
