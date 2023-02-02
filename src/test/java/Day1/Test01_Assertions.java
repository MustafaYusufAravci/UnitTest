package Day1;




import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test(){ // main metodu olmadan nasıl çalıştı ??
        // Junit içinde gömülü gelen main metodu kullanılıyor
        // Junit 5 ile beraber methodlar public ile belirtilmesi
        // zorunluluğu ortadan kalktı.

    }

    //!!! test isimlendirmelerinde --> "test" ile başlar
    @Test
    public void testLength(){ // String.length()

        String kelime = "Merhaba Dünya"; // 13 karakter
        int anlikDeger = kelime.length();
        int beklenenDeger = 13;
        assertEquals(beklenenDeger,anlikDeger);

    }

    // Başka bir örnek
    @Test
    public void testUpperCase(){ // String.toUpperCase()
        String anlikDeger = "Merhaba".toUpperCase(); //"MERHABA"
        String beklenenDeger = "MERHABA";
        // assertEquals(beklenenDeger,anlikDeger);
        // hata anında kullanıcıya mesaj göndermek istiyorsam :
        assertEquals(beklenenDeger,anlikDeger,"UpperCase() metodu düzgün çalışmadı");

    }

    // Diğer Örnek

    @Test
    void testToplama() { // Math.addExact()
        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1,sayi2);
        int beklenenDeger = 15;
        assertEquals(beklenenDeger,anlikDeger);

    }

    // Başka Örnek
    @Test
    void testContains(){ // String.contains()

        assertEquals(false,"Mirac".contains("z"));
    }

}
