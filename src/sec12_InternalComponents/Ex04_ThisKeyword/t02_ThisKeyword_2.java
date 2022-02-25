package sec12_InternalComponents.Ex04_ThisKeyword;

class A1{
    int m, n;  //
    void init(int m, int n){    // 필드와 메서드에 같은걸
        // 위 int m,n과는 다른거야
        m = m;        // 지역변수 m ------------------------------------------------------------------
        n = n;        // 지역변수 n ------------------------------------------------------------------
    }
}

class B1{
    int m, n;
    void init(int m, int n){
        this.m = m;     // cf -> (객체 뱃속의 m이야) or (필드 m이야)
        this.n = n;     // this를 붙여야 위에꺼를 의미한다.
    }
}

public class t02_ThisKeyword_2 {
    public static void main(String[] args){
        // 1. 필드명과 지역변수의 이름이 같은경우(this키워드를 사용하지 않는 경우)
        A1 a1 = new A1();
        a1.init(2,3);
        System.out.println(a1.m);   // 0(this 안 붙일시) // ---------------------------------------------------------
        System.out.println(a1.n);   // 0(this 안 붙일시) -> 왜인지 알아? 실제로 필드값이 한번도 건드려 본적이 없다는거야.------

        System.out.println();
        // 2. 필드명과 지역변수의 이름이 같은경우(this키워드를 사용하는 경우)
        B1 b1 = new B1();
        b1.init(2,3);
        System.out.println(b1.m);
        System.out.println(b1.n);
    }
}
