//Sınıf içerisinde generic bir metod tanımlayacaksın diye, sınıfı da generic yapmak zorunda değilsin.



public class GenericMetot {


    //Hoca burada <T, U> gibi birden çok alacaksa belirtiyor fakat bu kullanım da geçerli.
    //Ya da T1,T2 diye de belirtebilirsin.
    public static <T> void printArray(T[] arr, T[] arr2){
        for (T i :
                arr) {
            System.out.println(i);
        }

        for (T i :
                arr2) {
            System.out.println(i);
        }
    }

}
