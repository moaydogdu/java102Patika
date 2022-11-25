public class MultiGenericNullable <T1, T2, T3>{

    private T1 object1;
    private T2 object2;
    private T3 object3;

    public MultiGenericNullable(T1 object1, T2 object2, T3 object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
    }

    public T1 getObject1() {
        return object1;
    }

    public void setObject1(T1 object1) {
        this.object1 = object1;
    }

    public T2 getObject2() {
        return object2;
    }

    public void setObject2(T2 object2) {
        this.object2 = object2;
    }

    public T3 getObject3() {
        return object3;
    }

    public void setObject3(T3 object3) {
        this.object3 = object3;
    }

    public void showInfo(){
        //getName uzun, getSimpleName kısa adını verir sınıfın.
        System.out.println("T1 : " + getObject1() + " : " + getObject1().getClass().getSimpleName()); //Nesnenin sınıfının(Türünün) adını verir.
        System.out.println("T2 : " + getObject2() + " : " + getObject2().getClass().getSimpleName()); //İstersen objeye get ile eriş
        System.out.println("T3 : " + getObject3() + " : " + getObject2().getClass().getSimpleName()); //İstersen erişme kafana göre
    }

}
