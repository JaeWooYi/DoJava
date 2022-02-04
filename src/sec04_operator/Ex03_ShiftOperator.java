package sec04_operator;

public class Ex03_ShiftOperator {
    public static void main(String[] args) {
        // 산술 시프트
        // @ <<
        System.out.println(3 << 1);
        System.out.println(-3 << 1);
        System.out.println(3 << 2);
        System.out.println(-3<< 2);
        System.out.println();

        // @ >>
        System.out.println(5 >> 1);
        System.out.println(-5 >> 1);
        System.out.println(5 >> 2);
        System.out.println(-5 >> 2);
        System.out.println();

        // 논리 시프트(>>>)
        System.out.println(3 >>> 1);
        System.out.println(-3 >>> 31);
    }
}
