public class Main {
    public static void main(String[] args) {

        /**
         * Boxing (Kutulama)
         * Unboxing (Kutudan Çıkarma)
         *
         * Boxing : İlkel veri tipini Wrapper Veri tipine çevirmeye boxing
         * Unboxing :Wrapper haldeki veri tipini ilkel hale çevirmeye Unboxing denir.
         * AutoBoxing : ilkel veri tipini Wrappere otomatik dönüştürmeye autoboxing denir.
         * AutoUnboxing : ilkel veri tipine Wrapper atama işleminin otomatik yapılması.
         *
         *
         */

        int a = 20;
        Integer b = a; //Autoboxing
        Integer c = Integer.valueOf(a); //Boxing
        int d = c; //AutoUnboxing
        int e = c.intValue();//Unboxing (Bu metod geriye primitive olarak int değerini döndürür.)
        
    }
}