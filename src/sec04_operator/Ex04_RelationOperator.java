package sec04_operator;

public class Ex04_RelationOperator {
    public static void main(String[] args) {
        // 크기 비교
        System.out.println(5 < 2);
        System.out.println(5 > 2);
        System.out.println(5 < 5);
        System.out.println(5 <= 5);
        System.out.println(5 >= 5);
        System.out.println();

        // 등가 비교
        // @기본 자료형 등가 비교
        int a = 5;
        int b = 2;
        int c = 5;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a == c);
        System.out.println(a != c);
        System.out.println();

        // @참조 자료형 등가 비교
        // 참조 자료형은 힙영역에 데이터를 저장
        String a2 = new String("안녕");
        String b2 = new String("안녕");
        System.out.println(a2 == b2);   // -> 스택의 값을 비교하기 때문에 false
    }
}
