package sec23_Exception.sec02_ExceptionHandlingSyntax.e02_MultiCatch_1;

public class MultiCatch_1 {
    public static void main(String[] args) {
        // #1. 단일 try-catch
        try{
            System.out.println(3/0);
        }catch (ArithmeticException arithmeticException){
            System.out.println("숫자는 0으로 못나눵");
        }finally {
            System.out.println("프로그램종료1");
        }

        System.out.println("-------------------------");

        try{
            int number = Integer.parseInt("10A");        // 실행예외중 : NumberFormatException
        }catch (NumberFormatException numberFormatException){
            System.out.println("숫자로 바꿀수 없습니다");
        }finally {
            System.out.println("프로그램종료2");
        }

        System.out.println("------------------------------");
        // #2. 다중 try-catch
        System.out.println("다중 try - catch");
        try{
            System.out.println(5/0);
            int num = Integer.parseInt("10B");  // 이걸 위에쓰면 "숫자로 바꿀수 없다3" 이게 나와 // 캐치블록은 가장먼저 캐치되는 예외만 실행된다.ㄷ
        }catch (ArithmeticException arithmeticException){
            System.out.println("숫자는 0으로 못나눠3");
        }catch (NumberFormatException numberFormatException){
            System.out.println("숫자로 바꿀수 없다3");
        }finally {
            System.out.println("프로그램 종료3");
        }
    }
}
