package Day3;

public class C01_StringModify {
    // Task : kelimenin ilk 2 harf içerisinde A varsa silinsin,
    // kelimelerin hepsi büyük harf olarak verilecek

    // AABC --> BC   ,  ABC  --> BC  , AA --> ""  , AB -->  B , ABBGVAFS --> BBGVAFS
    public String deleteAIfItIsInFirstTwoPosition(String str){

        if(str.length()<=2) return str.replace("A","");

        String firstTwoChars = str.substring(0,2);
        String afterFirstTwoChars = str.substring(2);

        return firstTwoChars.replaceAll("A","") + afterFirstTwoChars;
    }


}
