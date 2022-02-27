package sec14_modifier.a1_accessModifier.ex01.p01_pack;

public class B {



    public void print(){

        // 1. 객체 생성(멤버 활용을 위한)
        A kkk = new A();

        // 2. 멤버활용
        System.out.print(kkk.a + " ");
        System.out.print(kkk.b + " ");
        System.out.print(kkk.c + " ");
//        System.out.println(kkk.d);    // 이친구 혼자 private라서 오류나는거야
    }
}
