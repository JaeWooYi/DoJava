package sec23_Exception.sec01_ExceptionHandling.e01_TypeOfException;

// CloneNotSupportedException 예
class A {   // 아무것도 없어보이지만 A 뒤에는 extends Object가 생략되어있는거야
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();   // clone 의 역할은 객체를 복사해서 리턴하는 것
    }
//    void abc(){
//        this.clone();
//    }
}

public class e01_CheckedException {
    public static void main(String[] args){
        // # Checked Exception(일반예외 - 문법적으로 체크)

        // #1. InterruptedException
//        Thread.sleep(1000);

        // #2. ClassNotFoundException
//        Class cls = Class.forName("java.lang.Object");

        // #3. IOException
//        InputStreamReader in = new InputStreamReader(System.in);
//        in.read();

        // #4. FileNotFountException
//        FileInputStream fileInputStream = new FileInputStream("text.txt");

        // #5. CloneNotSupportedException
        A a1 = new A();
//        A a2 = a1.clone();  // 클론이 뭐냐면 이게 클론이래  // 사용하고싶다면 클론이라는 메서드를 오버라이딩 // 오버라이딩하고 .찍으면 클론은 보임
//        A a2 = (A)a1.clone();
    }
}
