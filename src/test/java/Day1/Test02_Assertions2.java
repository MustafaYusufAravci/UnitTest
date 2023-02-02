package Day1;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_Assertions2 {

    @Test
    void testToFindMin() { // Math.min()   // assertTrue - assertFalse

        // assertTrue( 11.5 == Math.min(11.5, 14.4));

        assertFalse(Math.min(12.3 , 13.5 )  != 12.3);

        //assertEquals(14, Math.min(14,17));

    }

    @Test
    void testArrays(){
        String str = "Test işlemi çok kolay";
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"Test", "işlemi", "çok", "kolay"};

        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }
}
