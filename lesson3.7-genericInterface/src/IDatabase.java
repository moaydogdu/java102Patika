
//Bu bir interface'dir, Interface tanımlarken baş harfini topluluk alışkanlığı sebebiyle I yapıyoruz.
//Böylelikle bunun bir class değil interface olduğunu isimden direk anlayabiliyoruz.

public interface IDatabase<T> {

    public boolean insert(T data);

    public boolean delete(T data);

    public boolean update(T data);

    public T select();

}
