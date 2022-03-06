package sec23_Exception.sec02_ExceptionHandlingSyntax.e04_MultiCatch_3;

public class MultiCatch_3 {
    public static void main(String[] args) {

        // #1. catch 블록을 각각 처리한 경우
        try{
            System.out.println(5/1);
            int num = Integer.parseInt("10B");
        }catch (ArithmeticException e){
            System.out.println("예외가 발생했습니다1");
            // 순서를 바꾸면 된다
        }catch (NumberFormatException e){
            System.out.println("예외가 발생했습니다2");
        }

        System.out.println("------------------------");
        // #2. 캐치블록을 하나로 통일한경우
        try{
            System.out.println(5/1);
            int num = Integer.parseInt("10A");
        }catch (ArithmeticException | NumberFormatException e){
            System.out.println("예외가 발생했습니다");
        }

    }
}
