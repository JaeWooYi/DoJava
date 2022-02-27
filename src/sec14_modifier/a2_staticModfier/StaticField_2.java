package sec14_modifier.a2_staticModfier;

// static 필드의 공유 특징
class AA {
    int m = 3;          // 인스턴스
    static int n = 5;   // 정적
}

public class StaticField_2 {
    public static void main(String[] args){
        AA a1 = new AA();
        AA a2 = new AA();

        // 인스턴스 필드
        a1.m = 5;
        a2.m = 6;
        System.out.println(a1.m);
        System.out.println(a2.m);   // a1, a2는 서로 각각 다른 값이 나왔지?
        System.out.println();

        // 정적 필드
        a1.n = 7;
        a2.n = 8;
        System.out.println(a1.n);
        System.out.println(a2.n);   // static같은경우에는 같은게 나와. 왜냐? 메모리 구조를 생각해봐
        System.out.println();

        // 이번엔 지향하는방법으로 해보자
        AA.n = 9;
        System.out.println(AA.n);
    }
}
