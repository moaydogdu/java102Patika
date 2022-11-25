/**
 * Bu sınıfın amacı dinamik bir Dizi tutması ve veri tipini dinamik olarak almasıdır. Dolayısıyla bu sınıf generic bir dizi sınıfıdır.
 *
 * Sınıf Özellikleri;
 *
 * 1 - Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmaktadır. [OK]
 * 2 - Sınıfa ait iki tür constructor bulunmalıdır. [OK]
 * 3 - MyList boş constructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır. [OK]
 * 4 - MyList(int capacity) dizinin başlangıç değeri capacity parametresinden alınmalıdır. [OK]
 * 5 - size() dizideki eleman sayısını verir. [OK]
 * 6 - getCapacity() dizinin kapasite değerini verir. [OK]
 * 7 - add(T data) sınıfa ait diziye eleman eklemek için kullanılmalıdır. Eğer dizide yeteri kadar yer yoksa dizi boyutu iki katına çıkarılmalıdır. [OK]
 *
 * 8 - get(int index) verilen indisteki değeri döndürür. Geçersiz indis girilirse null döndürür. [OK]
 * 9 - remove(int index) verilen indisteki değeri silip, değerleri sola doğru kaydırır. Geçersiz indis girilirse null döndürür. [OK]
 * 10 - set(int index, T data) verilen indisteki değeri gönderilen veri ile değiştirir. Geçersiz indis girilirse null döndürür. [OK]
 * 11 - String toString() Sınıfa ait dizideki elemanları listeleyen metod.  [OK]
 *
 * 12 - int indexOf(T data) : Parametrede verilen nesnenin listedeki indexini verir. Nesne listede yoksa -1 değerini verir. [OK]
 * 13 - int lastIndexOf(T data) : Parametrede verilen nesnenin listedeki son indexini verir. Nesne listede yoksa -1 değerini verir. [OK]
 * 14 - boolean isEmpty() : Listenin boş olup olmadığını true ya da false değeri döndürerek bildirir. [OK]
 * 15 - T[] toArray(): Listedeki öğeleri aynı sırayla bir dizi haline getirip geriye döndürür. Yalnızca elemanları içeren bir dizi. [OK]
 * 16 - clear() : Listedeki bütün öğeleri siler, boş bir liste haline getirir. [OK]
 * 17 - MyList<T> sublist(int start, int finish) : Parametrede verilen index aralığına ait bir liste döner. [OK]
 * 18 - boolean contains(T data) : Parametrede verilen değerin listede olup olmadığını söyler. [OK]
 */
public class MyList<T> {

    public T[] genericArray;

    /**
     * Varsayılan Parametresiz Constructor.
     *
     */
    public MyList(){
        setGenericArray(new Object[10]); //Diziyi 10 eleman ile başlattığımız yer.
    }


    /**
     * Parametreli Constructor Metodu.
     *
     * @param capacity oluşturulmak istenen dizinin boyutunu temsil eder. Burada değer girerek istenilen boyutta (eleman sayısına sahip)
     *                 dizi oluşturulabilir.
     *
     *
     */
    public MyList(int capacity) {
        setGenericArray(new Object[capacity]);

    }


    /**
     * Belirtilen index numarasındaki veriyi, gönderilen veri ile değiştiren metod.
     *
     * @param index değiştirilmek istenen verinin konumunu, indis numarasını belirtir.
     * @param data yeni veriyi belirtir.
     * @return işlem başarılı ise true, başarısız ise false döndürür.
     */
    public boolean set(int index, T data){
        if(index>=0){
            //Eğer parametre 0 veya daha büyükse
            if(index<=getCapacity()-1){
                //Eğer index numarası, mevcut dizinin sınırları içerisindeyse çalışacak kod bloğu,
                //Aksi taktirde out of bounds hatası alırız, bunu önlemek için bu kontrolleri yapıyoruz.

                getGenericArray()[index] = data;

                return true; //İşlemin başarılı olduğunu bildirir.
            }
            else{
                System.out.println("HATA : Belirtilen index("+index+") dizi sınırları dışındadır."); //Hatayı kullanıcıya console aracılığıyla bildiriyoruz.
                return false; //Geriye false döndürüyoruz, işlem başarısız.

            }
        }
        else{
            //Bu noktada gönderilen parametre negatif değere sahip demektir. Geriye null döndürüp, console'a hata yazdır.
            System.out.println("HATA : setElement metoduna negatif değer girilmemelidir.");
            return false; //İşlem başarısız geriye false döndürüyoruz.

        }
    }


    /**
     * Parametre ile gönderilen indis değerini diziden siler, diziyi sola kayıdırır.
     * İşlem başarılı olursa geriye true, başarısız olursa geriye false değerini ve akabinde konsola hatayı belirten mesajı döndürür.
     *
     * @param index silinmek istenen elemanın indis numarasını temsil eder.
     * @return true ya da false olarak işlem sonucunu döndürür.
     */
    public boolean remove(int index){
        //Gönderilen parametrenin geçerliliğinin kontrolü;
        if(index>=0){
            //Eğer parametre 0 veya daha büyükse
            if(index<=getCapacity()-1){
                //Eğer index numarası, mevcut dizinin sınırları içerisindeyse çalışacak kod bloğu,
                //Aksi taktirde out of bounds hatası alırız, bunu önlemek için bu kontrolleri yapıyoruz.
                for(int i = index;i<getCapacity()-1;i++){
                    getGenericArray()[i] = getGenericArray()[i+1];
                }
                getGenericArray()[getCapacity()-1] = null;
                return true; //İşlemin başarılı olduğunu bildirir.
            }
            else{
                System.out.println("HATA : Belirtilen index("+index+") dizi sınırları dışındadır."); //Hatayı kullanıcıya console aracılığıyla bildiriyoruz.
                return false; //Geriye false döndürüyoruz, işlem başarısız.

            }
        }
        else{
            //Bu noktada gönderilen parametre negatif değere sahip demektir. Geriye null döndürüp, console'a hata yazdır.
            System.out.println("HATA : getElement metoduna negatif değer girilmemelidir.");
            return false; //İşlem başarısız geriye false döndürüyoruz.

        }



    }


    /**
     * Parametre olarak gönderilen indexte bulunan elemanı geriye döndürür.
     * Eğer geçersiz bir index gönderilirse null döndürür.
     *
     * @param index elemanın indis numarasını temsil eder.
     * @return T tipinde dizi elemanını geriye döndürür.
     */
    public T get(int index){
        //Gönderilen parametrenin geçerliliğinin kontrolü;
        if(index>=0){
            //Eğer parametre 0 veya daha büyükse
            if(index<=getCapacity()-1){
                //Eğer index numarası, mevcut dizinin sınırları içerisindeyse çalışacak kod bloğu,
                //Aksi taktirde out of bounds hatası alırız, bunu önlemek için bu kontrolleri yapıyoruz.
                return getGenericArray()[index]; //İlgili indexte bulunan elemanı bulup, return ile metodun çağırıldığı yere geri yolluyoruz.

            }
            else{
                System.out.println("HATA : Belirtilen index("+index+") dizi sınırları dışındadır."); //Hatayı kullanıcıya console aracılığıyla bildiriyoruz.
                return null; //Geriye null döndürüyoruz

            }
        }
        else{
            //Bu noktada gönderilen parametre negatif değere sahip demektir. Geriye null döndürüp, console'a hata yazdır.
            System.out.println("HATA : getElement metoduna negatif değer girilmemelidir.");
            return null;

        }
    }


    /**<pre>
     * Gönderilen verinin dizide olup olmadığın kontrol eder. İlk indexini geriye döndürür.
     * Eğer veri dizide mevcutsa hangi indexte olduğu bilgisi döner.
     * Eğer veri dizide mevcut değilse geriye -1 değeri döner.
     *
     * Bu metodda dikkat edilmesi gereken metod yapısı gereği ilgili elemanın ilk indexini verecektir.
     * Örneğin "Muhammet" değerini string türde bir dizide arıyor olalım. Bu elemandan birden fazla olabilir.
     * İlki 5. indexte ikincisi 15. indexte olabilir. Aşağıdaki kod 5. indexte onu tespit ettiği an return ile geriye indexini döndürecek
     * Ardından return yaptığı için metod sonlanacaktır.
     * </pre>
     * @param data dizi içerisinde aranacak olan veri, eleman.
     * @return ilgili veri dizide varsa onun index numarası, yoksa -1 döner.
     */
    public int indexOf(T data){
        for(int i = 0;i<getCapacity();i++){
            //Diziyi baştan sona dönen for döngüsü.
            if(get(i)==data){
                //Elemanı tespit ettik demektir, bu durumda geriye i değerini yani ilgili elemanın index değerini döndürüyoruz.
                return i;
            }
        }
        return -1;//Yukarıdaki return hiç çalışmamışsa, ilgili veri dizide yok demektir. Geriye -1 döndürüyorum.
        //Çünkü yukarıdaki return 1 kere çalışsaydı metod orada biterdi. Buraya gelmezdi.
    }


    /**
     * <pre>
     * Bu metod parametre olarak gönderilen veriyi dizi içerisinde arar ve hangi indexte olduğunu bulur.
     * Bu metodun indexOf metodundan farkı indexOf metodu bulunduğu ilk indexi verirken,
     * lastIndexOf metodu bulunduğu en son indexi verir.
     * </pre>
     * @param data dizi içerisinde aranacak olan veriyi temsil eder.
     * @return geriye eğer dizi içerisinde ilgili eleman varsa, bulunduğu en son indexi, yoksa -1 döndürür.
     */
    public int lastIndexOf(T data){
        int lastIndex=-1; //İlk değer atamasını varsayılan olarak -1 ayarlıyorum. Çünkü eğer dizide belirtilen eleman yoksa -1 dönülecek.
        //Belirtilen eleman bulunursa lastIndex olarak atanacak.

        for(int i = 0;i<getCapacity();i++){
            if(get(i)==data){
                lastIndex=i; //Belirtilen data bulunursa index lastindex'e atanacak. Daha sonra tekrar bulunursa yine atama yapılacağı için
                //Otomatik olarak lastIndex'i güncellenmiş olacak.
            }
        }


        return lastIndex;
    }


    /**<pre>
     * Diziye tek bir eleman eklemek için kullanılan, tek parametreli metod.
     * Eklenilecek olan eleman, sınıf tanımlanırken kullanılan, belirtilen türde olmalıdır.
     * Metod eleman eklemesi yapmadan önce yeterli yer olup olmadığını kontrol eden checkCapacity metodunu çağırır.
     * </pre>
     * @param element
     */
    public void add(T element){
        checkCapacity(1); //Kapasite kontrol metodunu 1 elemanlık yer için çağırıyoruz.

        //Diyelim ki dizi 10 kapasitesine sahip, içerisinde 1 eleman var.
        //Dizideki son elemanın bulunduğu yerin indis numarası 0'dır.
        //Dizideki ilk boş yerin indis numarası 1'dir.
        //Dolayısıyla ilk boş yerin indis numarası, getSize metodundan dönen eleman sayısıdır.
        //Çünkü dizilerin indis numarası 0'dan başlamaktadır.

        getGenericArray()[size()]=element;

    }


    /**
     * Diziye birden çok eleman eklemek için kullanılan metod.
     * Parametre sayısı kullanıcı tarafından girilen eleman sayısı kadardır.
     * Örneğin String a, String b, String c, .... bu metod ile istenildiği kadar giriş yapılabilir
     * Elemanları eklemeden önce eklenilecek eleman sayısı checkCapacity metoduna bildirilir.
     * İlgili metod gerekli yeri kontrol eder, gerekirse bu kadar yer açar diziyi büyütür.
     *
     *
     * @param elements gelen parametreler elements adı altında bir dizide tutulur.
     */
    public void addMultipleElement(T... elements){

        checkCapacity(elements.length); //Gelen parametre sayısı kadar yer var mı kontrol ettiriyoruz.

        for (T element:
                elements) {
            int elementNumber = 0;
            getGenericArray()[size()+elementNumber++] = element;
            //Yukarıda getsize ile ilk boş yer dönüyor, ona element numberi ekliyoruz.
            //İlk eklemede getSize+0 ekliyor sonra elementNumber'i arttırıyor.
            //Dolayısıyla burayı da otomatize ediyoruz.
        }
    }


    /**
     * Eğer eklenmek istenen eleman sayısı için yer yoksa, kapasiteyi arttıran doubleCapacity metodu çağrılır ve
     * rekürsif olarak kendini tekrar çağırararak,
     * ekleme için yeterli alan olup olmadığını tekrar kontrol eder.
     *
     * @param elementCount eklenmek istenen eleman sayısını temsil eder.
     */
    public void checkCapacity(int elementCount){
        if(!(elementCount<=getAvailableCapacity())){
            //Eğer eklenmek istenen eleman sayısı, boş yerden daha fazlaysa; yani yeterli yer yok ise.
            //Kapasiteyi arttıran metodu çağır ve tekrar kontrol et.
            this.doubleCapacity();
            this.checkCapacity(elementCount);
        }

    }


    /**<pre>
     * Dizinin eleman sayısını bulan metottur.
     * Burada dikkat edilmesi gereken geriye kapasiteyi değil, mevcutta bulunan eleman sayısını,
     * yani null olmayan değer sayısını döndürecektir.
     * </pre>
     * @return (Integer)eleman sayısı.
     */
    public int size(){
        int elementCounter = 0;

        for(int i=0;i<getCapacity();i++)
        {
            if(getGenericArray()[i]!=null){
                elementCounter++;
            }

        }
        return elementCounter;
    }


    /**<pre>
     * Dizinin boş olup olmadığını (Yani içerisinde veri olup olmadığını) kontrol eden metod.
     * Eğer dizide 1 veya daha fazla eleman varsa geriye false döner,
     * Eğer dizide eleman yoksa geriye true döner.
     * </pre>
     * @return eğer boş ise true, dolu ise false döner.
     */
    public boolean isEmpty(){

        if(size()>0){
            //Size metodu dizide bulunan eleman sayısını verir(Kapasitesini Değil)
            //Eğer eleman sayısı 1 veya daha fazlaysa dizi boş değil demektir.
            //Bu durumda geriye false döndürüyorum çünkü is empty (Boş mu?) sorusuna false(hayır) yanıtını veriyoruz.
            return false;
        }
        else{
            //Dizideki eleman sayısı 0 ise yani dizi boş ise geriye evet is empty diyoruz :)
            return true;
        }

    }


    /**
     * <pre>
     * Bu metot dizinin kapasitesini geriye döndürür.
     * Dizinin kapasitesi ile eleman sayısı aynı şey değildir.
     * Dizinin kapasitesi 10 fakat eleman sayısı 0,1,2...10 olabilir.
     * </pre>
     * @return Kapasite
     */
    public int getCapacity(){
        return getGenericArray().length;
    }


    /**
     * Dizide bulunan boş yer sayısını geriye döndürür.
     * Örneğin dizi kapasitesi 10 ve içerisinde 7 eleman varsa, geriye 3 döndürecektir.
     * @return (Integer) boş yer sayısı.
     */
    public int getAvailableCapacity(){
        return getCapacity()- size();
    }


    /**<pre>
     * Diziyi ekrana yazdırmak için kullanılır.
     * Bütün elemanları tek tek, satır satır konsola yazdırır.
     * Geriye değer döndürmez.
    *
     * Null durumda olan bir class'ı toString ile yazıdrmaya kalktığında hata alırsın.
     * Burada bunu her ne kadar önlemeyi denesem de olmadı, dönüp bakacağım buraya. ! ! ! ! ! ! ! ! !
     * </pre>
     */
    @Override
    public String toString(){
        if(isEmpty()==true){
            return "";
        }
        else {
            String stringData = "[";
            for (T element :
                    getGenericArray()) {
                if (element == null) {
                    //Eğer eleman null ise, string'e ekleme.
                    break; //Döngüyü kır. Çünkü eğer null elemanlara geldiysek, devamında veri yoktur.
                }
                stringData += element + ",";
            }
            char[] charArray = stringData.toCharArray();
            charArray[charArray.length - 1] = ']';
            stringData = new String(charArray);
            return stringData;
        }
    }


    /**
     * Generic Array'imize erişmek için kullanılmalıdır.
     * Geriye mevcuttaki Array'i T[] tipinde döndürecektir.
     *
     *
     * @return
     */
    public T[] getGenericArray(){
        return this.genericArray;
    }


    /**
     * Gönderilen Object Türündeki diziyi T generic türüne cast ederek,
     * mevcuttaki generic diziye atar.
     *
     * Örneğin Object türünde 30 elemanlı yeni bir dizi oluşturup yollarsanız
     * new Object[30] şeklinde parametre geçebilirsiniz.
     *
     * Dışarıdan erişimi kapalıdır. Yalnızca doubleCapacity metodu tarafından
     * kontrollü bir şekilde kullanılmalıdır. Aksi taktirde veri kaybına yol açacaktır.
     *
     * @param array
     */
    private void setGenericArray(Object[] array){
        this.genericArray = (T[]) array;
    }


    /**<blockquote>
     * Dizinin kapasitesini iki katına çıkartır.
     *</blockquote>
     * Örneğin dizi kapasitesi 10 ise sırasıyla aşağıdaki işlemleri yapacaktır.
     * <blockquote><pre>
     *     1 - Diziyi olduğu gibi geçici bir başka diziye atayarak elemanların yedeğini alır.
     *     2 - Diziyi yeniden tanımlar. Bu sırada eleman sayısını mevcut olanın 2 katı olarak ayarlar. (10 ise 20, 20 ise 40 gibi)
     *     3 - Ardından yeni oluşturulan ve boş olan diziye eski elemanları eski sırayla atamaya başlar.
     * </pre></blockquote>
     */
    public void doubleCapacity(){
        T[] temporaryArray = getGenericArray(); //Diziyi aynı türde fakat geçici başka bir diziye aktarır. Böylece eleman kaybı yaşanmaz. Yedek almak gibi düşün.

        //this.genericArray = (T[]) new Object[getCapacity()*2];//Düz kullanım, fakat kapsülleme gereği bunu değil alttakini kullanıyorum. Bu da geçerli.

        setGenericArray(new Object[getCapacity()*2]); //Ana diziyi yeniden oluşturduğumuz yer burası, parametre olarak new diyerek yolluyoruz ki yeni ve boş oluştursun.
        //Kapasitesini ise 2 ile çarpıp veriyoruz.

        //Sıra geldi eski elemanları yerine yerleştirmeye;

        int i = 0; //İndis numarasını takip edebilmek için bu değişkeni oluşturuyoruz.
        for (T oldElements:
             temporaryArray) {
            this.genericArray[i++]=oldElements; //Burası çalışırken i++ şeklinde yazdığım için örneğin; 0. elemana atama yapar ve işlem sonunda değeri 1 arttırır.
        }
    }

    /**
     * Liste içerisindeki elemanları (null veriler hariç)
     * Yeni bir dizi olarak geriye döndürür.
     * @return T[] türünde sadece listenin dolu elemanlarını içeren dizi.
     */
    public T[] toArray(){
        T[] newArray = (T[]) new Object[size()]; //Dizinin eleman sayısı boyutunda yeni bir dizi oluşturuyorum.

        for(int i = 0;i<size();i++){
            newArray[i] = get(i);
        }
        return newArray;
    }


    /**
     * Listedeki bütün öğeleri siler, bunu diziyi baştan oluşturarak yapar.
     */
    public void clear(){
        setGenericArray(new Object[10]);
        //setGenericArray metodu ile diziyi baştan oluşturuyoruz, böylece içerisindeki her şey de otomatik olarak silinmiş oluyor.
    }

    /**
     * Başlangıç ve bitiş noktası parametre aracılığıyla belirtilen nesneden yeni bir liste nesnesi oluşturur.
     * Eğer negatif bir değer girersen ya da mevcut listenin aralığı dışında bir değer girersen geriye null olarak bu nesneden döndürür.
     * Bu nesneyi aman diyeyim yazdırma exception atmadan yaptım hataya düşeriz toString ile
     *
     * @param start başlangıç indexini belirtir.
     * @param finish bitiş indexini belirtir.
     * @return başlangıç ve bitiş indexleri de dahil olmak üzere arada kalana elemanlardan yeni bir liste oluşturur.
     */
    public MyList<T> subList(int start, int finish){

        //Parametrelerin geçerliliğinin kontrolü, bu aralık mevcut dizi ile uyumlu mu?
        if(start>=0 && finish>=0){
            //Yani sayılar 0 ve daha büyükse negatif değilse;

            if((start<this.getCapacity())&&(finish<this.getCapacity())){
                //Sayıların aralığı dizinin içeriği ile uyumlu mu? Örneğin 20 elemanlı bir diziden 10-30 arası elemanları istemek hataya sebebiyet olacaktır.
                //Eğer her iki parametre de dizinin kapasitesinden düşük ise yani 10 kapasiteli dizide 10'dan küçük 9,8,7,... ise dizinin aralığında bir değer isteniyor demektir.
                //Artık parametrelerin hataya sebebiyet vermeyeceğinden emin olduğum için esas işlemi yapıyorum;

                int newListElementCount = (finish-start)+1;
                //0,3 parametresi geldiği durumda 3-0 = 3 fakat istenen toplam eleman sayısı 4. Bu durumda +1 eklerim.
                //1,3 parametresi geldiği durumda 3-1 = 2 fakat istenen toplam eleman sayısı 3. Bu durumda +1 eklerim.
                //Yukarıdaki değişken istenen toplam eleman sayısını bulmaktadır.


                MyList<T> newList = new MyList<>(newListElementCount);
                for(int i=start;i<=finish;i++){
                    newList.add(get(i)); //get(i) ile mevcut generic dizinin elemanına erişiyor, add ile yeni generic diziye ekliyoruz.
                }

                return newList;//Yeni oluşturulan nesneyi verileri girdikten sonra geri yolluyorum.

            }
            else {
                //Bu durumda girilen parametreler 0 veya daha büyük fakat
                //Dizinin aralığının üzerine çıkıyor demektir. Çünkü parametrelerden bazıları kapasite değerinden büyük.
                //Geriye null döndürüp, hatayı console'a yazdırıyorum.
                System.out.println("HATA : Parametrelerin dizinin sınırlarından büyük olmaması gerekiyor.");
                return null;

            }

        }
        else{
            //Bu durumda parametreler negatif değer içermektedir. Hata mesajı ile kullanıcıyı bildiriyoruz.
            System.out.println("HATA : Parametrelerin 0 ve daha yüksek değerlere sahip olması gerekmektedir.");
            return null;
        }
    }

    /**
     * Parametre olarak gönderilen verinin listede olup olmadığını kontrol eder.
     *
     * @param data liste içerisinde aranacak veri.
     * @return data listede varsa geriye true, listede yoksa false döner.
     */
    public boolean contains(T data){

        for(int i =0;i<getCapacity();i++){
            if(get(i)==data){
                //Datayı dizi içerisinde bulduk demektir.
                return true;

            }
        }
        return false; //Yukarıdaki true dönmediyse, bu eleman dizide mevcut değildir. False dönüyorum.


    }

}
