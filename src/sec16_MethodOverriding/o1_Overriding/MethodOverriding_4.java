package sec16_MethodOverriding.o1_Overriding;

class AAA {
    protected void abc(){

    }
}

// public 접근지정자
class BBB extends AAA{
    @Override
    public void abc() {

    }
}

// protected 접근지정자
class CCC extends AAA{
    @Override
    protected void abc() {

    }
}

// default 접근지정자
//class DDD extends AAA{      // 접근지정자가 부모꺼 보다 얘가 더 작지? 그래서 오류인거야
//    @Override
//    void abc() {
//
//    }
//}
//
// private 접근지정자
//class EEE extends AAA{      // 접근지정자가 부모꺼 보다 얘가 더 작지? 그래서 오류인거야
//    @Override
//    private void abc() {
//
//    }
//}

public class MethodOverriding_4 {
    public static void main(String[] args){
    }
}
