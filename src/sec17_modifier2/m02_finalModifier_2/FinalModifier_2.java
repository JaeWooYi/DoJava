package sec17_modifier2.m02_finalModifier_2;

class A{
    void abc(){}     // 일반메서드
    final void bcd(){}   // final메서드 -> overriding이 되지 않는다.
}

class B extends A{
    @Override
    void abc(){}
//    @Override
//    void bcd(){}     // final메서드이기에 overriding이 되지 않는것을 확인
}

final class C{}         // final클래스!

//class D extends C{}     // 상속도 안돼!!

public class FinalModifier_2 {
}
