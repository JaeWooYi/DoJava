package sec20_InnerClassAndInnerInterface.ex01_InstanceInnerClass;

class A {   // outer class

    // 멤버 : 필드 4개, 메서드 1개, 인스턴스 이너클래스
    // --------------------------------------------
    // 필드 4개
    public int a = 3;
    protected int b = 5;
    int c = 7;
    private int d = 9;

    // 메서드 1개
    void abc(){
        System.out.println("A클래스의 메서드 abc()");
    }

    // 인스턴스 이너클래스
    class B{
        void bcd(){
            // outer class의 필드 사용
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            // outer class의 메서드 호출
            abc();
        }
    }
    // --------------------------------------------
}

public class i01_CreateObjectAndAccessMember {
    public static void main(String[] args){
        // 객체 생성 단계1 : outer class의 객체 생성
        A a = new A();
        // B객체 생성법 형태
        A.B ab = a.new B();

        a.abc();
        System.out.println();
        ab.bcd();
    }
}
