public class Main {
    public static void main(String[] args) {


        String[] aDizi = {"Java","102","Patika","Dev"};
        Integer[] bDizi = {1,2,3,4};
        //Integer[] cDizi = new Integer[10]; //10 elemanlı integer tipinde değer ataması olmaksızın yapılan dizi tanımlaması.
        Character[] cDizi = {'J','A','V','A'};

        /**
        //String dizimi ekrana basmak için foreach döngüsü
        for (String i :
                aDizi) {
            System.out.println(i);
        }

        System.out.println(" ");


        //Integer dizimi ekrana foreach ile yazıyorum.
        for (int i : //Burada Integer de diyebilirsin sana kalmış
                bDizi) {
            System.out.println(i);
        }

        System.out.println(" ");

        //Char arayimi ekrana foreach ile yazıyorum.
        for (char i :
                cDizi) {
            System.out.println(i);
        }
        */

        GenericMetot.printArray(aDizi,bDizi);


    }
}