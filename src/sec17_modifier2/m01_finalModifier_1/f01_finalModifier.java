package sec17_modifier2.m01_finalModifier_1;

class A1{
    int a = 3;
    final int b = 5;
    A1(){

    }
}

class A2{
    int a;
    final int b;
    A2(){
        a = 4;
        b = 6;
    }
}

// 생성자에서 값을 바꾸는건 되는지 한번 확인해볼까?
class A3{
    int a = 1;
    final int b = 2;
    A3(){
        a = 4;
//        b = 6;  // 역시나 되지 않는다 -> final필드는 무슨일이있어도 값을 못바꿔(최초 선언된 이후 값을 대입할 수 없다.)
    }
}

// 지역변수라고 뭐가 다를까? 확인해보자!
class B {
    void bcd(){
        int a = 3;
        final int b = 4;    // 메서드안에서 만들어진거 지역변수야
        a = 4;
//        b = 5;    // 달라지는건없어
    }
}

public class f01_finalModifier {
    public static void main(String[] args){
        // 1. 객체 생성
        A1 a1 = new A1();
        A2 a2 = new A2();

        // 2. 필드값 변경
        a1.a = 10;
//        a1.b = 9;   // final(상수화) 이기 때문에 값을 못 바꿈
        a2.a = 1;
//        a2.b = 2;   // 생성자를 통해 필드를 초기화해도 역시나 값을 못 바꿈
    }
}
