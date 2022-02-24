package sec12_InternalComponents.Ex02_Method;

// #클래스의 외부에서 메서드 호출

// 1.
class A {
    // 1-1. 리턴타입 void + 매개변수(x)
    void print() {
        System.out.println("HI");
    }

    // 1-2. 리턴타입 int + 매개변수(x)
    int data() {
        return 3;
    }

    // 1-3. 리턴타입 double + 매개변수(2개)
    double sum(int a, double b) {
        return a+b;
    }
    // 1-4. 리턴타입: void + 내부에 리턴 포함 (함수를 종료한다는 의미)
    void printMonth(int m) {
        if(m<0 || m>12){
            System.out.println("잘못 입력.");
            return;     // void 내의 return은 뒤에 뭐가 안옴.
        }
        System.out.println(m+"월 입니다.");
    }
}

public class m01_ExternalCallMethod {
    public static void main(String[] args) {
        // 2. 객체생성
        A a = new A();

        // 3. 메서드 호출(멤버 활용)
        a.print();

        int k = a.data();
        System.out.println(k);

        double result = a.sum(3,0.1);
        System.out.println(result);

        a.printMonth(5);
        a.printMonth(15);
    }
}
