package sec23_Exception.sec02_ExceptionHandlingSyntax.e03_MultiCatch_2;

public class MultiCatch_2 {
    public static void main(String[] args) {

        // #1. catch 블록의 순서가 잘못된 경우
//        try{
//            System.out.println(5/1);
//            int num = Integer.parseInt("10B");
//        }catch (Exception e){
//            System.out.println("숫자는 0으로 못나눠");
//        }catch (NumberFormatException e){
//            System.out.println("숫자로 바꿀수 없다");
//        }finally {
//            System.out.println("프로그램 종료");
//        }

        // #2. catch 블록의 올바른 순서
        try{
            System.out.println(5/1);
            int num = Integer.parseInt("10B");

        }catch (NumberFormatException e){
            System.out.println("숫자로 바꿀수 없다");
                                                    // 순서를 바꾸면 된다
        }catch (Exception e){
            System.out.println("숫자는 0으로 못나눠");

        }finally {
            System.out.println("프로그램 종료");
        }

    }
}
