package sec15_inheritancePolymorphism.i03_typeCasting;

class KKK {
    int m = 3;
    void abc(){
        System.out.println("KKK 클래스");
    }
}

class LLL extends KKK{
    int n = 4;
    void bcd(){
        System.out.println("LLL 클래스");
    }
}

public class TypeCasting_2 {
    public static void main(String[] args){
        // 1. KKK 타입, KKK 생성자
        KKK kkk = new KKK();
        System.out.println(kkk.m);
        kkk.abc();

        System.out.println();

        // 2. LLL 타입, LLL 생성자
        LLL lll = new LLL();
        System.out.println(lll.m);
        System.out.println(lll.n);
        lll.abc();
        lll.bcd();

        System.out.println();

        // 3. KKK 타입 , LLL 생성자 -> 다형적 표현
        KKK kkk2 = new LLL();
        System.out.println(kkk2.m); // .찍어보면 KKK 객체만 가리키는걸 볼수있음
        kkk2.abc();                 // .찍어봐 뭐만 나오는지
    }
}
