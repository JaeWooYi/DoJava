package sec25_Generic.g08_BoundedTypeOfGeneric.g04_InheritanceOfGenericClass_01;

class Parent<T> {
    T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}

class Child1<T> extends Parent<T>{}

class Child2<T, K, V> extends Parent<T>{
    K k;
    V v;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}

public class InheritanceOfGenericClass_01 {
    public static void main(String[] args) {
        // #1. 부모 제네릭 클래스
        Parent<String> parent = new Parent();
//        Parent<String> parent = new <>Parent();
        parent.set("부모제네릭 클래스");
        System.out.println(parent.get());

        System.out.println();

        // #2. 자식 클래스1
        Child1<String> child1 = new Child1<>();
        child1.set("Child1 class");
        System.out.println(child1.get());

        System.out.println();

        // #3. 자식 클래스2
        Child2<String, String, Integer> child2 = new Child2<>();
        child2.set("부모");
        child2.setK("KKK");
        child2.setV(100);
        System.out.println("T : " + child2.get() + " --- " + "K : " + child2.getK() + " --- " + "V : " + child2.getV());
    }
}
