package sec16_MethodOverriding.o03_SuperAndSuperMethod;

class K {
    K(){
        this(10);   // K생성자 2
        System.out.println("K생성자 1");
    }
    K(int a){
        System.out.println("K생성자 2");
    }
}

class M extends K{
    M(){
        this(5);    // M생성자 2
//        super();      // 위 this 주석하고 돌릴시
        System.out.println("M생성자 1");
        System.out.println();
    }
    M(int a){
        super();
        System.out.println("M생성자 2");
    }
}

public class s04_superMethod_4 {
    public static void main(String[] args){
        // 1. K 객체 생성
        K k1 = new K();
        K k2 = new K(1);

        System.out.println("----------------- ");
        // 2. M 객체 생성
        M m1 = new M();
        M m2 = new M(5);
        // super들 때문에 부모꺼도 같이 찍혀 -> 안써도 컴파일러가 자동으로 추가해.
    }
}
