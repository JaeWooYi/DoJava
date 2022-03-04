package sec19_Interface.ex01_InterfaceCharacteristics;

interface A{
    public static final int a = 3;  // 모든 필드는 public static final
    public abstract void abc();     // 모든 메서드는 public abstract
}

interface B{
    int b = 5;      // 필수사항이기 때문에 아무것도 안써도 컴파일러가 자동으로 public static final가 붙어 있는 형태
    void bcd();     // 마찬가지로 생략시 자동으로 public abstract가 붙어 잇는거야
}

public class i01_InterfaceCharacteristics {
    public static void main(String[] args) {
        // 1. static이 자동으로 추가됐는지 체크해보기
        System.out.println(A.a);
        System.out.println(B.b);    // 진짜 생략되 있는거구만
        System.out.println();

        // 2. final 자동추가 체크
//        A.a = 5;
//        B.b = 7;      // 오류나는걸 보니 정말로 final이로구만


    }
}
