package sec25_Generic.g07_GenricMethod2;

class A {
    public <T> void method1(T t){
        //System.out.println(t.lenght());       // 타입t는 length라는 메서드를 가지고있지 않아 : ObjectMethod 만 호출 가능하다
        System.out.println(t.equals("HI"));     // ObjectMethod 만 호출 가능하다
    }
}

public class AvailableMethodInGenericMethod {
    public static void main(String[] args){

        A a = new A();
        a.<String>method1("안녕");

    }
}
