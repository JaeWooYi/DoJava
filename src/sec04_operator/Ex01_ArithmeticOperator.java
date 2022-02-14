package sec04_operator;

public class Ex01_ArithmeticOperator {
    public static void main(String[] args){
        // 산술 연산자
        System.out.println(2+3);
        System.out.println(8-5);
        System.out.println(7*2);
        System.out.println(7/2);
        System.out.println(8%5);
        System.out.println();

        // 증감 연산자 @case1

        // 후위형
        int a = 3;
        a++;
        System.out.println(a);  // 결과가 4가 나온다

        // 전위형
        int b = 3;
        ++b;
        System.out.println(b);  // 결과가 4가 나온다
        System.out.println();

        // 증감 연산자 @case2

        // 후위형
        int d1 = 3;
        int d2 = d1++;          // d1을 먼저 d2에 넣은다음 더하라.
        System.out.println(d1); // 결과가 4가 나온다.
        System.out.println(d2); // 고로 d2는 3이 나오고 d1은 4가 나온다.
        System.out.println();

        // 전위형
        int e1 = 3;
        int e2 = ++e1;          // e1을 증가시키고 e2에 더한값을 집어 넣어라.
        System.out.println(e1);
        System.out.println(e2); // 고로 둘다 4가 나온다
        System.out.println();

        // 증감 연산자 @case3
        // 후위와 전위가 섞여 있다면
        int f1 = 3;
        int f2 = 4;
        int f3 = 2 + f1-- + ++f2;   // 뭐가 나올까? 2 + 3 + 5 예상합니다.
        System.out.println(f1);     // 2
        System.out.println(f2);     // 5
        System.out.println(f3);     // 10
                                    // 전위와 후위를 완벽히 이해 했군.
    }
}
