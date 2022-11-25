/**
 * Sınırlandırılmış Türler (bounded types)
 *
 * Generic sınıf veya metot tanımlarken parametre olarak aldığınız türü sınırlandırabilirsiniz. Örneğin, parametre olarak aldığım
 * tür Number sınıfının alt sınıflarından biri olsun diyebilirsiniz. Böyle bir durumda Number sınıfından türetilmemiş hiç bir sınıfı
 * parametre olarak veremezsiniz.
 *
 * Tür sınırlandırması yaparken extends veya super deyimi kullanılır. Bu deyimlerden sonra bir sınıf veya arayüz ismi verilir.
 * Bu deyimleri kullanarak parametre olarak generic türünü sınırlandırmış oluruz.
 *
 *  **extends deyimini kullandıysak yalnızca belirttiğimiz türü veya alt sınıflarını kullanabiliriz. Buna üst sınır (upper-bound) denir.
 *
 *  **super deyimini kullandıysak yalnızca belirttiğimiz türün üst sınıflarını kullanabiliriz. Kendisini dahi kullanamayız. Buna alt sınır
 *  yani lower-bound denir.
 *
 *  Örnek kullanım <T extends Number>
 *      veya
 *                  <T super Entity>
 *
 *
 *
 */

public class Main {


    public static void main(String[] args) {






    }
}