public class Main {
    public static void main(String[] args) {

        int a = 20;
        Integer b = 20;

        /**
         * Yukarıdaki iki tanımlama da doğrudur fakat Wrapper şekilde tanımlanan
         * b nesnesinin Integer sınıfıyla gelen metodlara örneğin toString gibi
         * erişimi vardır. Çünkü bu metodlar Integer sınıfının içerisinde
         * Java tarafından önceden Static biçimde tanımlıdırlar.
         *
         * Örneğin String veri = a; tanımlaması hatalıdır. toString metodu da kullanılamaz.
         * Fakat b.toString() diyerek çevrim işlemi yapılabilir.
         *
         * 
         *
         */



    }
}