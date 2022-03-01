package sec16_MethodOverriding.o2_OverlapMember;

class AAA {
    static void print(){
        System.out.println("AAA class");
    }
}

class BBB extends AAA{
    static void print(){
        System.out.println("BBB class");
    }
}

public class o03_OverlapStaticMethod {
    public static void main(String[] args){
        // 1. static이니까 클래스 이름으로 바로 접근해보자.
        AAA.print();
        BBB.print();
        System.out.println();

        //2. 객체생성해서 해보기
        AAA aaa = new AAA();
        BBB bbb = new BBB();
        AAA aaa1 = new BBB();

        aaa.print();    // AAA
        bbb.print();    // BBB
        aaa1.print();   // AAA
    }
}
