package sec14_modifier.a1_accessModifier.ex01.p02_pack;

import sec14_modifier.a1_accessModifier.ex01.p01_pack.A;

public class C {
    public void print(){

        A kkk = new A();

        System.out.print(kkk.a + " ");  // 퍼블릭만 다른패키지에 있는거 가져다 쓸 수 있음을 아래 주석을 풀어보면 확인 가능
//        System.out.print(kkk.b);
//        System.out.print(kkk.c);
//        System.out.print(kkk.d);
    }
}
