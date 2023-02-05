package Day3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_StringModifyTest {

    C01_StringModify strModify; // new C01_StringModify();

    @BeforeEach
    void setup(){
        strModify = new C01_StringModify();
        System.out.println("@BeforeEach çalıştı");

    }

    @AfterEach
    void tearDown(){
        strModify = null;
        System.out.println("@AfterEach çalıştı");
    }

    @ParameterizedTest
    @CsvSource(value={"BC, AABC", "BA, ABA", "BC, BAC"})
    void deleteIfItIsInFirstTwoPositionTest(String expected, String actual){

        assertEquals(expected, strModify.deleteAIfItIsInFirstTwoPosition(actual));
        System.out.println("Çalıştı");

    }
}
