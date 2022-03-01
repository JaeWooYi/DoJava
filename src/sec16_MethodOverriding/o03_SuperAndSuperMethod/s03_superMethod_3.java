package sec16_MethodOverriding.o03_SuperAndSuperMethod;

class AAA {
    AAA(){
        System.out.println("AAA 생성자");
    }
}

class BBB extends AAA {
    BBB() {
        // 이 구간에는 super() 가 생략 되있는거야
        System.out.println("BBB 생성자");
    }
}

class CCC {
    CCC(int a){
        System.out.println("CCC 생성자");
    }
}

class DDD extends CCC{
//    DDD(){          // 1k.
//        super();    // 2k.
//    }               // 3k. -> 1k~3k : 컴파일러가 자동으로 추가해주는 내용

    DDD(){
        super(1);
    }
}

public class s03_superMethod_3 {
    public static void main(String[] args){
        // 1. AAA 객체 생성
        AAA aaa = new AAA();

        System.out.println();

        // 2. BBB 객체 생성
        // super()가 생략되있어 그래서 값이 2개나올꺼야 부모꺼까지
        BBB bbb = new BBB();
    }
}
