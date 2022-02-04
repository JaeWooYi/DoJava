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
        int a = 3;
        a++;
        System.out.println(a);

        int b = 3;
        ++b;
        System.out.println(b);
        System.out.println();

        // 증감 연산자 @case2
        int d1 = 3;
        int d2 = d1++;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println();

        int e1 = 3;
        int e2 = ++e1;
        System.out.println(e1);
        System.out.println(e2);
        System.out.println();

        // 증감 연산자 @case3
        int f1 = 3;
        int f2 = 4;
        int f3 = f1-- + ++f2;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
