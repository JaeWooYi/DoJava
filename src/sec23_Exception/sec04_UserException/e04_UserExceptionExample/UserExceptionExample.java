package sec23_Exception.sec04_UserException.e04_UserExceptionExample;

// #1. 점수가 음수인 경우의 예외발생
class MinusException extends Exception {

    public MinusException() {
        super();
    }
    public MinusException(String message) {
        super(message);
    }
}

// #2. 점수가 100을 초과한 경우의 예외발생
class OverException extends Exception {

    public OverException() {
        super();
    }
    public OverException(String message) {
        super(message);
    }
}

class A {
    void checkScore(int score) throws MinusException, OverException {
        if(score < 0){
            throw new MinusException("예외 발생 : 음수값입력");
        }else if(score > 100){
            throw new OverException("예외 발생 : 100점 초과");
        }else
            System.out.println("정상적인 값입니다");
    }
}

public class UserExceptionExample {
    public static void main(String[] args){
        A a = new A();
        try {
            a.checkScore(85);
            a.checkScore(150);
            a.checkScore(-20);  // 위에꺼 에러발생후 예외가 발생해서 안나오는거 알지?
        } catch (MinusException | OverException e) {
            System.out.println(e.getMessage());
        }
    }
}
