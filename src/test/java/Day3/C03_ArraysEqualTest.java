package Day3;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C03_ArraysEqualTest {

    @ParameterizedTest
    @MethodSource("arrayArguments")
    void arrayKiyasla(boolean sonuc, Object[] x, Object[] y) {

        assertEquals(sonuc, C03_ArraysEqual.arrayKiyasla(x,y));

    }

    static Stream<Arguments> arrayArguments() {

        Integer[] a1 = {1,2,3,4};
        Integer[] a2 = {2,1,4,3};

        String[] s1 = {"j", "a", "v"};
        String[] s2 = {"a", "j", "v"};

        Double[] d1= {1.2, 2.3, 5.6};
        Double[] d2= {2.3, 1.2, 5.6};

        return Stream.of(Arguments.of(true, a1, a2),
                Arguments.of(true, s1,s2),
                Arguments.of(true, d1,d2));

    }
}
