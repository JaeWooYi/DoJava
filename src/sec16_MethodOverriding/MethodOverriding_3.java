package sec16_MethodOverriding;

class AA{
    void print1(){
        System.out.println("AA class print1");
    }
    void print2(){
        System.out.println("AA class print2");
    }
}

class BB extends AA{
    @Override
    void print1(){
        System.out.println("BB class print1");
    }
//    @Override   // 이게 왜안되는지 알아? 시그니처 때문이야. 밑에 print2() 여기 괄호 안에 인자값 봐
                  // 오버라이드 어노테이션 없애고 쓰면 그냥 오버로딩일 뿐 후후
//    void print2(int a){
//        System.out.println("BB class print2");
//    }
    void print2(int a){
        System.out.println("BB class print2");
    }
}

public class MethodOverriding_3 {
    public static void main(String[] args){
        // 1. A type / A Constructor
        AA aa = new AA();
        aa.print1();    // AA print1
        aa.print2();    // AA print2

        System.out.println();

        // 2. B type / B Constructor
        BB bb = new BB();
        bb.print1();       // BB print1
        bb.print2();       // AA print2
        bb.print2(1);   // BB print2

        System.out.println();

        // 3. A type / B Constructor
        AA aa1 = new BB();
        aa1.print1();   // BB print1
        aa1.print2();   // AA print2    // 애는 오버로딩이야

    }
}
