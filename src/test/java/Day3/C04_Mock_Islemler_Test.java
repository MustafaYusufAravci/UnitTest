package Day3;

import org.junit.jupiter.api.*;
import org.mockito.*;

import static org.mockito.Mockito.*;

public class C04_Mock_Islemler_Test {

    @Test
    void islemler(){
        C04_Mock_Islemler dummyObject = Mockito.mock(C04_Mock_Islemler.class);

        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Kasım");

        // methodlar çağrılmış mı kontro ledelim
        verify(dummyObject).ekleOgrenci("Kasım");
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");
    }

    // methodun kaç kere çağrıldığını test edelim
    @Test
    void testKacDefaCagrildi(){
        C04_Mock_Islemler dummyObject2 = Mockito.mock(C04_Mock_Islemler.class);

        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Mehmet");

        verify(dummyObject2, times(2)).ekleOgrenci("Ahmet");
        // Halide parametresi ile ekleOgrenci() metodu hiiç çağrılmama durumunu kontrol etmek istersem
        verify(dummyObject2,times(0)).ekleOgrenci("Halide");
        // herhangi bir parametre ile hiç çağrılmayan method
        verify(dummyObject2, never()).silOgrenci(anyString());
        // metodun en az 2 defa çağrıldığı durumu test edelim
        verify(dummyObject2, atLeast(2)).ekleOgrenci("Ahmet");
    }

    // methodların çağrılma sırasını test edebiliriz
    @Test
    void testSirasiniKontrol(){
        C04_Mock_Islemler dummyObject3 = Mockito.mock(C04_Mock_Islemler.class);

        dummyObject3.ekleOgrenci("Ahmet");
        dummyObject3.ekleOgrenci("Huseyin");
        dummyObject3.silOgrenci("Ahmet");

        InOrder inOrder = inOrder(dummyObject3);

        inOrder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject3).ekleOgrenci("Huseyin");
        inOrder.verify(dummyObject3).silOgrenci("Ahmet");


    }
}
