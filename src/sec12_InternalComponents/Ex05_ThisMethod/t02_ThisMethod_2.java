package sec12_InternalComponents.Ex05_ThisMethod;

// this(생성자 매개변수) 활용
// 1. 클래스 생성
class B1{
    int m1, m2, m3, m4;
    B1(){
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    B1(int a){
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 3;
    }
    B1(int a, int b){
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 3;
    }
    void print(){
        System.out.print(m1 + " " + m2 + " " + m3 + " "  + m4);
    }
}

class B2{
    int m1, m2, m3, m4;
    B2(){
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    B2(int a){
        this();
        m1 = a;
    }
    B2(int a, int b){
//        this();
//        m1 = a;
//        m2 = b;
        this(a);    // 위를 또 줄이면 이렇게 된다.
        m2 = b;
    }

    void print(){
        System.out.print(m1 + " " + m2 + " " + m3 + " "  + m4);
    }
}

public class t02_ThisMethod_2 {
    public static void main(String[] args){
        // 1. this() 미사용 , B1클래스
        B1 b1 = new B1();
        B1 b2 = new B1(10);
        B1 b3 = new B1(5,15);
        b1.print();
        System.out.println();
        b2.print();
        System.out.println();
        b3.print();
        System.out.println();
        System.out.println();

        // 2. this() 사용 , B2클래스
        B2 b4 = new B2();
        B2 b5 = new B2(9);
        B2 b6 = new B2(3,5);
        b4.print();
        System.out.println();
        b5.print();
        System.out.println();
        b6.print();
    }
}
