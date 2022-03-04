package sec19_Interface.ex05_CreateObjectOfInterface_02;

// (객체 생성)방법2. 익명이너클래스를 이용한 객체 생성
interface A{
    public static final int a = 3;
    public abstract void abc();
}

public class i05_CreateObjectOfInterface_02 {
    public static void main(String[] args){
        A a = new A(){
            public void abc(){
                System.out.println("(객체 생성)방법2. 익명이너클래스를 이용한 객체 생성");
            }
        };
        a.abc();

        System.out.println();

        A a2 = new A(){
            public void abc(){
                System.out.println("(객체 생성)방법2. 익명이너클래스를 이용한 객체 생성_2");
            }
        };

        a2.abc();
    }
}
