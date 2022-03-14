package sec25_Generic.g08_BoundedTypeOfGeneric.g03_BoundedTypeOfInputArguments;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

class Goods<T>{
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}

class Test {
    void method1(Goods<A> goods) {}     // case1 : A
    void method2(Goods<?> goods) {}     // case2 : A, B, C, D, String, Integer ... 등등 어떤게 와도 된다.
                                        // ?는 와일드 카드다 -> 모든객체가 올 수 있따. : T가 어떤게 와도 상관없다
    void method3(Goods<? extends B> goods) {}   // case3 : 누구든 올순 있지만 B를 상속받은 애들만(B 이거나 하위 클래스) -> B, C, D
    void method4(Goods<? super B> goods) {}     // case4 : A or B
}

public class BoundedTypeOfInputArguments {
    public static void main(String[] args) {

        Test test = new Test();

        // case1 -> T가 A로 매핑된거만 가능.
        test.method1(new Goods<A>());
//        test.method1(new Goods<B>());
//        test.method1(new Goods<C>());
//        test.method1(new Goods<D>());

        // case2 -> T가 어떤것을 매핑해도 가능.
        test.method2(new Goods<A>());
        test.method2(new Goods<B>());
        test.method2(new Goods<C>());
        test.method2(new Goods<D>());
        test.method2(new Goods<String>());
        test.method2(new Goods<Integer>());

        // case3 -> T가 B 이거나 B 하위 클래스일때 가능.
//        test.method3(new Goods<A>());
        test.method3(new Goods<B>());
        test.method3(new Goods<C>());
        test.method3(new Goods<D>());

        // case4 -> T가 B 이거나 B의 슈퍼클래스만(A).
        test.method4(new Goods<A>());
        test.method4(new Goods<B>());
//        test.method4(new Goods<C>());
//        test.method4(new Goods<D>());
    }
}
