package Day3;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class C02_FirstTwoLastCharsSameTest {

    C02_FirstTwoLastCharsSame obj = new C02_FirstTwoLastCharsSame();

    @ParameterizedTest
    @CsvSource(value = {"true, ABAB", "true, BABA", "false, ABCD", "true, AB", "false, B", "true, "})
    void check_If_First_Two_Last_Two_Are_Same_Test(boolean rs, String str){

        assertEquals(rs, obj.check_If_First_Two_Last_Two_Are_Same(str));

    }

    // @ValueSource ile yazsaydık ne değişirdi ???
    @ParameterizedTest
    @ValueSource(strings= {"ABAB", "BABA", "AB"})
    void check_If_First_Two_Last_Two_Are_Same_Test2(String str){

        assertTrue(obj.check_If_First_Two_Last_Two_Are_Same(str));

    }

    @ParameterizedTest
    @ValueSource(strings= {"ABCD", "ABT", "D"})
    void check_If_First_Two_Last_Two_Are_Same_Test3(String str) {
        assertFalse(obj.check_If_First_Two_Last_Two_Are_Same(str));
    }



}
