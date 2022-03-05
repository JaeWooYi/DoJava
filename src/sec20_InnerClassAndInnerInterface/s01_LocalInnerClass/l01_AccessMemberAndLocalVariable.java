package sec20_InnerClassAndInnerInterface.s01_LocalInnerClass;

class A {
    int a = 3;      // 필드
    void abc(){
        int b = 5;  // 지역변수 ----> final이 생략되 있는것이다 -> 값 변경 불가

        // 지역이너클래스
        class B {
            void bcd(){
                System.out.println(a);  // 필드
                System.out.println(b);  // 지역변수

                a = 10;
//                b = 99;   // final이라서 못 바꿔 위에 읽어봐
            }
        }

        // 지역 이너클래스 이기 때문에 abc() 안에서 정의된 것이기 때문에 여기에 바로 객체 생성하는 코드를 넣는다
        B bb = new B();
        bb.bcd();
    }
}

public class l01_AccessMemberAndLocalVariable {
    public static void main(String[] args){
        // 객체 생성 및 메서드 호출
        A a = new A();
        a.abc();
    }
}
