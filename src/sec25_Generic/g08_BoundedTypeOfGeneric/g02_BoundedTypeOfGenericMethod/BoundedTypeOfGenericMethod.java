package sec25_Generic.g08_BoundedTypeOfGeneric.g02_BoundedTypeOfGenericMethod;

class A {
    public <T extends String> void method1(T t) {
        System.out.println(t.charAt(1));    // extends String 를 통해 .charAt(1)메서드를 가져올수있다. 상속안하면 자동으로 Object 만 상속하니까 Object 메서드만 가져올수 있자나
    }
}

interface myInterface {
    public abstract void printKKK();
}

class B {
    public <T extends myInterface> void method1(T t) {    // 인터페이스임에도 불구하고 extends myInterface 라고 상속을한다
        t.printKKK();
    }
}

public class BoundedTypeOfGenericMethod {
    public static void main(String[] args){
        A a = new A();
//        a.<String>method1("안녕");
        a.method1("안녕");    // 스트링 생략되있는거야. 위에 바바

        B b = new B();
//        b.method1(myInterface 를 구현한 클래스의 객체가 와야 한다);
        b.method1(new myInterface() {
            @Override
            public void printKKK() {
                System.out.println("printKKK() 구현");
            }
        });
    }
}
