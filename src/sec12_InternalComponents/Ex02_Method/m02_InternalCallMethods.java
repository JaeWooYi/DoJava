package sec12_InternalComponents.Ex02_Method;

public class m02_InternalCallMethods {
    public static void main(String[] args) {
        // 1. 같은 클래스안에 있는 내부 메서드 호출 -> 객체 생성 안해도 된다.
        print();
        int a = twice(3);
        System.out.println(a);
        double b = sum(4,0.9);
        System.out.println(b);
    }

    public static void print(){
        System.out.println("HI");
    }

    public static int twice(int k){
        return k*2;
    }

    public static double sum(int m, double n){
        return m + n;
    }
}
