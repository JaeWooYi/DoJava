package sec12_InternalComponents.Ex01_field;

// 필드와 지역변수의 구분

// 1. 클래스를 생성
class A {
    int m = 3;  // 필드
    int n = 4;  // 필드

    // 메서드 2개 추가
    void work1() {
        int k = 5;  // 메서드 안에 있으므로 지역변수이다.
        System.out.println(k);  // 지역 변수 출력. -> 5가 나옴
        work2(3);
    }
    void work2(int i) { // (1). int i -> 입력 매개변수, (2). i -> 외부에서 전달된 값, (3). 지역 변수
        int j = 4;  // 지역 변수
        System.out.println(i + j);  // i + 4
    }
}

public class f01_FieldComponent {
    public static void main(String[] args) {
        // 2. 클래스를 활용하여 객체 생성
        A a = new A();

        // 3-1. 필드값 출력
        System.out.println(a.m);
        System.out.println(a.n);
        System.out.println();

        System.out.println("3-2");
        // 3-2. 메서드 호출
        a.work1();
    }
}
