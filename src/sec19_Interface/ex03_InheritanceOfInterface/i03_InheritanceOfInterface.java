package sec19_Interface.ex03_InheritanceOfInterface;

// 접근지정자 test
interface A{
    public abstract void abc();
}

interface B{
    void bcd();
}

class C implements A{
    @Override
    public void abc() {     // public 접근지정자가 붙었어.

    }
}

//class D implements B {
//    @Override
//    void bcd(){     // 오류가 나네? 접근지정자가 아무것도 없네? default라는 뜻이네? 오류가 나네? -> 접근지정자가 더 작아져서 그래
//
//    }
//}

public class i03_InheritanceOfInterface {
}
