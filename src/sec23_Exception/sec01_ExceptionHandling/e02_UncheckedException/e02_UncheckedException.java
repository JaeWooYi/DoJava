package sec23_Exception.sec01_ExceptionHandling.e02_UncheckedException;

class A {}
class B extends A {}

public class e02_UncheckedException {
    public static void main(String[] args) {
        // # UncheckedException(실행 예외) = RuntimeException

        // #1. ArithmeticException
//        System.out.println(3/0);

        // #2. ClassCastException
//        A a = new A();
//        B b = (B)a;

        // #3. ArrayIndexOutOfBoundException
//        int[] array1 = new int[]{1,2,3};
//        System.out.println(array1[3]);

        // #4. NumberFormatException
//        int num = Integer.parseInt("10A");
//        System.out.println(num);

        // #5. NullPointException
//        String str = null;
//        System.out.println(str.charAt(2));
    }
}
