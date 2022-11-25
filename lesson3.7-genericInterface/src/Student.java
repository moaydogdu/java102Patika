/**
 * Eğer interface'i T değil String tanımlasaydım aşağıdaki metodların parametreleri ve select'in dönüşü String olacaktı.
 *
 * Diyelim ki ben bu sınfın içerisinde T olarak gelen veriyi yine T olarak işlemek istiyorum, yani türünü bilmiyorum.
 * O zaman da STudent sınıfını generic yapmam gerekirdi.
 */


public class Student<T> implements IDatabase<T> {

    @Override
    public boolean insert(T data) {
        System.out.println("Veri eklendi.");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Veri silindi.");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Veri güncellendi.");
        return true;
    }

    public T select() {
        System.out.println("Al sana veri.");
        return null;
    }
}
