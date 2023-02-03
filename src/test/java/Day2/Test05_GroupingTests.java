package Day2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test05_GroupingTests {

    // amacımız : Atnı sınıfda birbirleriyle ilişkili testleri gruplamak için kullanılır
    @Nested
    class testMultiply{
        @ParameterizedTest
        void testMultiplyWithNonZero(int rs, int sayi1, int sayi2){
            assertEquals(rs, Math.multiplyExact(sayi1,sayi2));
        }

        @ParameterizedTest
        void testMultiplyWithZero(int rs, int sayi1, int sayi2){
            assertEquals(rs, Math.multiplyExact(sayi1,sayi2));
        }
    } //!!! 1. grup testin sonu

    @Nested
    class testAdd{

        @ParameterizedTest
        void testAddWithNoneZero(int rs, int sayi1, int sayi2){
            assertEquals(rs, Math.addExact(sayi1, sayi2));

        }

        @ParameterizedTest
        void testAddWithZero(int rs, int sayi1, int sayi2){
            assertEquals(rs, Math.addExact(sayi1,sayi2));
        }

    } // !!! 2.grup testin sonu
}
