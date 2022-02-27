package sec14_modifier.a1_accessModifier.ex03;

import sec14_modifier.a1_accessModifier.ex03.pack.ABC;
//import sec14_modifier.a1_accessModifier.ex03.pack.BCD;
//import sec14_modifier.a1_accessModifier.ex03.pack.CDE;

public class a01_AccessModifierOfClass_2 {
    public static void main(String[] args){

        ABC abc = new ABC();
//        BCD bcd = new BCD();  // 전부 디폴트 -> 객체 생성 불가능(BCD bcd) + 생성자 호출 불가능(BCD())
//        CDE cde = new CDE();  // 퍼블릭 + 디폴트 -> 객체 생성은 가능(CDE cde) + 생성자 호출 불가능(CDE())
    }
}
