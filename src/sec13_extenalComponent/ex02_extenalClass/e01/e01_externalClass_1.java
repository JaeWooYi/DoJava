package sec13_extenalComponent.ex02_extenalClass.e01;

// 1. 외부 클래스 정의
class A{
    int m = 3;
    int n = 4;

    void print(){
        System.out.println(m + ", " + n);
    }
}

public class e01_externalClass_1 {
    public static void main(String[] args){
        A a = new A();
        a.print();
    }
}
