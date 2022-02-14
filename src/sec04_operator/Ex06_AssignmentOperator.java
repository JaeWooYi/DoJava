package sec04_operator;

public class Ex06_AssignmentOperator {
    public static void main(String[] args) {
        // 대입 연산자와 축약 표현
        // @대입 연산자
        System.out.println("@대입 연산자");
        int a1 = 3;
        a1 = a1 + 3;
        System.out.println(a1); // 6
        System.out.println();

        // @축약 표현
        System.out.println("@축약 표현");
        int b1 = 5;
        System.out.println(b1 += 2);    // b1 = b1 + 2 = 7
        b1 = 5;
        System.out.println(b1 -= 2);    // b1 = b1 - 2 = 3
        b1 = 5;
        System.out.println(b1 *= 2);    // b1 = b1 * 2 = 10
        b1 = 5;
        System.out.println(b1 /= 2);    // b1 = b1 / 2 = 2
        b1 = 5;
        System.out.println(b1 %= 2);    // b1 = b1 % 2 = 1
        b1 = 5;

        // 비트연산자 따로 공부하기
        System.out.println(b1 |= 2);
        b1 = 5;
        System.out.println(b1 <<= 2);
        b1 = 5;
        System.out.println(b1 >>= 2);
        b1 = 5;
        System.out.println(b1 >>>= 2);
        b1 = 5;
        System.out.println(b1 += 2);
    }
}
