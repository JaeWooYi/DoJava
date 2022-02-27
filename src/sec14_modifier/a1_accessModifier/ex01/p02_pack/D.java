package sec14_modifier.a1_accessModifier.ex01.p02_pack;

import sec14_modifier.a1_accessModifier.ex01.p01_pack.A;

// D클래스는 A클래스를 상속(D는 A의 자식) -> 객체를 생성할 필요가 없다. 변수 그냥 쓸 수 있따.
public class D extends A{
    public void print(){
        System.out.print(a + " ");
        System.out.print(b + " ");  // 상속받으면 protected까지 가능하다.
//        System.out.println(c);
//        System.out.println(d);
    }
}
