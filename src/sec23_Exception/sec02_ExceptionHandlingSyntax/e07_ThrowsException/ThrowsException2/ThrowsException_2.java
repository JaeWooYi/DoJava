package sec23_Exception.sec02_ExceptionHandlingSyntax.e07_ThrowsException.ThrowsException2;

public class ThrowsException_2 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class cls = Class.forName("java.lang.Object2"); // java.lang.Object2 -> 일부러 클래스이름 Object2을 틀리게 써봄
    }
}
