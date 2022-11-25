public class GenericNullable <T>{

    private final T value;

    GenericNullable(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

    public boolean isNull(){
        //Bir metodun başında is varsa sorgulama metodu olacak ve dönüş tipi boolean olacaktır.
        //Bu bir kural değil fakat genelde bu şekilde kullanılmaktadır.

        if(this.value == null){
            //That means value is null. Return true.
            return true;
        }
        else return false;//That means isn't null.
    }

    public void run(){
        if(isNull()){
            System.out.println("Bu değişken NULL.");
        }
        else if(!isNull()) System.out.println("Değişken değere sahip = "+this.getValue());
        else System.out.println("Değişken tanımlanmış fakat içeriği boştur.");
    }

}
