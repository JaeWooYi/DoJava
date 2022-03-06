package sec23_Exception.sec02_ExceptionHandlingSyntax.e01_TryCatchFinally;

public class e01_TryCatchFinally {
    public static void main(String[] args){

        // 1. try-catch
        try{
            System.out.println(3/0);    // 실행예외 : ArithmeticException
            System.out.println(3/1);    // 하나 안되면 catch 블록으로 바로 점프해 이친구 무시하고
            System.out.println("프로그램 종료1");
        }catch(ArithmeticException arithmeticException){
            System.out.println("숫자는 0으로 나눌 수 없습니다");
            System.out.println("프로그램 종료2 : catch Block");
        }

        System.out.println("-----------------------------------------------");

        // 2. try-catch-finally
        try{
            System.out.println(3/0);
        }catch(ArithmeticException arithmeticException){
            System.out.println("숫자는 0으로 나눌 수 없습니다");
        }finally {
            System.out.println("프로그램 종료 : finally Block");
        }
    }
}
