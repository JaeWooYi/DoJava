package sec23_Exception.sec04_UserException.e01_CreateUserException;

// #1. 사용자 일반예외(checked Exception)
class MyException extends Exception{
    public MyException(){
        super();
    }
    public MyException(String message){
        super(message);
    }
}

// #2. 사용자 실행예외(Unchecked Exception = runtimeException)
class MyRunTimeException extends RuntimeException{
    public MyRunTimeException(){
        super();
    }
    public MyRunTimeException(String message){
        super(message);
    }
}

class A {
    // #3. 사용자 정의 예외 객체 생성
    MyException me1 = new MyException();
    MyException me2 = new MyException("예외 메시지 : MyException");

    MyRunTimeException mre1 = new MyRunTimeException();
    MyRunTimeException mre2 = new MyRunTimeException("예외 메시지: MyRunTimeException");

    // #4. 예외 던지기 (throw) : 던진시점에서 예외 발생
    // #4_1 방법1. 예외를 직접 처리
    void abc_1(int num){
        try {
            if (num > 70)
                System.out.println("정상작동");
             else
                throw me1;  // 예외를 던진 이 시점에 예외 발생

        }catch (MyException e){
            System.out.println("예외처리1");
        }
    }
    void bcd_1() {
        abc_1(65);
    }

    // -----------------------------------------------------------------------------------------------------------

    // #4_2 방법2. 예외의 전가
    void abc_2(int num) throws MyException {
        if(num > 70)
            System.out.println("정상작동");
        else
            throw me1;  // 예외를 던진 이 시점에 예외 발생
        }
        void bcd_2(){
            try{
            abc_2(65);
        }catch (MyException e){
                System.out.println("예외처리2");
            }
    }
}

public class CreateUserException {
    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
        a.bcd_2();
    }
}
