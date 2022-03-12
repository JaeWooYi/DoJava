package sec25_Generic.g03_GenricClass_1;

class MyClass<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}

public class SingleGenericArgument {
    public static void main(String[] args){
        MyClass<String> myClass1 = new MyClass<String>();
        myClass1.set("안녕");
        System.out.println(myClass1.get());

        MyClass<Integer> myClass2 = new MyClass<>();    // 뒤꺽세에서는 생략을 해도 된다.
        myClass2.set(100);
        System.out.println(myClass2.get());

        MyClass<Integer> myClass3 = new MyClass<>();
//        myClass3.set("안녕");     // 인티져만 가능하지 바부양  // 강한타입체크
    }
}
