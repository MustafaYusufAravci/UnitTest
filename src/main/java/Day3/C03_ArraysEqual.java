package Day3;

import java.util.*;

public class C03_ArraysEqual {
    // 2 array eşit mi ??

    public static boolean arrayKiyasla(Object[] a , Object[] b){


        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);

    }
}
