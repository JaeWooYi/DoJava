package sec25_Generic.g08_BoundedTypeOfGeneric.g01_BoundedTypeOfGenericClass;

class A {}
class B extends A {}
class C extends B {}

class D <T extends B>{      // B와 C만 올수 있다
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}

public class BoundedTypeOfGenericClass {
    public static void main(String[] args){
//        D<A> d1 = new D<A>();   // B와 C만 올수 있다. 그러므로 오류
        D<B> d2 = new D<B>();
        D<C> d3 = new D<C>();
//        D<C> dd = new D<>();    // 이런식으로 앞에 쓰면 뒤에는 생략회도 된다.
        D d4 = new D();         // 아무것도 안쓰게 된다면 어떤 타입이 들어갈까? 바로 최상위 타입 : B

        d2.set(new B());
        d2.set(new C());      // B와 C가 상속관계기 때문에 C로 와도 되는거 알지?
//        d3.set(new B());    // B는 C가 아니니까 불가능
        d3.set(new C());

        // 최상위니까 둘다 된다.
        d4.set(new C());
        d4.set(new B());
    }
}
