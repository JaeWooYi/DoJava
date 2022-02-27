package sec14_modifier.a3_staticMethod;

// 정적(static) 초기화 블록
class KKK{
    int a;
    static int b;

    KKK(){
        a = 3;  // 인스턴스 필드 초기화는 생성자에서 일반적으로 수행
//        b = 5;  // 여기에 값 넣어봤자 static은 초기화 안돼. 초기화하는법은 아래에
    }

    static {      // 요롷게
        b = 5;
        System.out.println("클래스 KKK가 로딩되었습니다!");    // 이걸 통해 순서를 확인가능
    }
}

public class s02_staticInitialBlock {
    public static void main(String[] args) {
        System.out.println(KKK.b);
    }
}
