package sec14_modifier.a1_accessModifier.ex01;

import sec14_modifier.a1_accessModifier.ex01.p01_pack.A;
import sec14_modifier.a1_accessModifier.ex01.p01_pack.B;
import sec14_modifier.a1_accessModifier.ex01.p02_pack.C;
import sec14_modifier.a1_accessModifier.ex01.p02_pack.D;

public class AccessModifierOfMember {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        System.out.println();
        b.print();
        System.out.println();
        c.print();
        System.out.println();
        d.print();
    }
}
