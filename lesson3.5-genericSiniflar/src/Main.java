public class Main {
    public static void main(String[] args) {
        /**
         * Java'da nesnelerin null, unidentified, boş olma gibi durumları mevcut.
         * Örneğin String s; tanımlaması undefined bir tanımlamadır.
         * Örneğin String s2 = null; //Bu tanımlamada değişken tanımlanmış fakat bellekte değerinin karşılığı yoktur.
         * Örneğin String s3 = ""; //Bu null ile çok benzerlik gösterse de bir karşılığı vardır bellekte fakat boştur.
         */


        String str="";
        Nullable nullable = new Nullable(str);
        nullable.run();

        int test1 = 21;
        //GenericNullable<Integer> genericNullable = new GenericNullable<Integer>(test1); Eski kullanım. Hata vermez.
        GenericNullable<Integer> genericNullable = new GenericNullable<>(test1);
        genericNullable.run();

        MultiGenericNullable<Integer,String,Integer> multiGenericNullable = new MultiGenericNullable<>(25,"Muhammet",34);
        multiGenericNullable.showInfo();


    }
}