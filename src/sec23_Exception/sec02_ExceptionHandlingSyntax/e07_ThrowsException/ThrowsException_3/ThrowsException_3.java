package sec23_Exception.sec02_ExceptionHandlingSyntax.e07_ThrowsException.ThrowsException_3;

// #1. 하위 메서드에서 직접 예외를 처리하는 경우
class A{
    void abc(){
        bcd();  // 이미 예외를 처리하였으므로 아무 문제없이 호출 가능
    }

    void bcd(){
        try {
            Class cls = Class.forName("java.lang.Object");  // 일반예외 : ClassNotFoundException
            Thread.sleep(1000); // 일반예외 : InterruptedException
        } catch (InterruptedException | ClassNotFoundException e) {
            // 예외처리구문 (따로 작성하지 않겠다)
        }
    }
}

// #2. 예외를 호출 메서드로 전가하는 경우
class B {
    void abc(){
        try {
            bcd();  // 일반예외 : InterruptedException
        } catch (InterruptedException | ClassNotFoundException e) {
            // 예외처리구문을 여기서 정의하면 된다
        }
    }
    void bcd() throws InterruptedException, ClassNotFoundException {
        Class cls = Class.forName("java.lang.Object");      // 일반예외 : ClassNotFoundException
        Thread.sleep(1000); // 일반예외 : InterruptedException
    }
}

public class ThrowsException_3 {
}
