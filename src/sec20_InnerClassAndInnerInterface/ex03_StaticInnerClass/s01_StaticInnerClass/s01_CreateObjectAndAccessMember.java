package sec20_InnerClassAndInnerInterface.ex03_StaticInnerClass.s01_StaticInnerClass;

class A {
    int a = 3;
    static int b = 4;
    void method1(){
        System.out.println("instance Method");
    }
    static void method2(){
        System.out.println("static Method");
    }

    // static inner class
    static class B{
        void abc(){
            // #1. 필드 사용
//            System.out.println(a);    // static class에서는 static 필드만
            System.out.println(b);
            // #2. 메서드 호출
//            method1();            // static class에서는 static 메서드만
            method2();
        }
    }
}

public class s01_CreateObjectAndAccessMember {
    public static void main(String[] args){
        // 1. static inner class 의 객체 생성
        A.B ab = new A.B();
        // 2. 메서드 호출
        ab.abc();
    }
}
