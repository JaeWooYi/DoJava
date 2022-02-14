package sec04_operator;

public class Ex02_BitwiseOperator {
    public static void main(String[] args) {
        // 자바 메서드로 진법 변환
        int data = 13;
        System.out.println(Integer.toBinaryString(data));   // toBinaryString(data) -> 2진수로 바꿔라
        System.out.println(Integer.toOctalString(data));    // toOctalString(data) -> 8진수로 바꿔라
        System.out.println(Integer.toHexString(data));      // toHexString(data) -> 16진수로 바꿔라
        System.out.println();

        System.out.println(Integer.parseInt("1101", 2)); // radix:2 -> 2진수를
        System.out.println(Integer.parseInt("15", 8));
        System.out.println(Integer.parseInt("0D", 16)); // d, 0d, D, 0D 다 상관없다.
        System.out.println();

        // 다양한 진법 표현
        System.out.println(13);
        System.out.println(0b1101);
        System.out.println(015);
        System.out.println(0x0D);
        System.out.println();

        // 비트 연산자
        // @And 비트 연산자
        System.out.println("and 비트 연산자 : &");
        System.out.println(3 & 10);
        System.out.println(0b0011 & 0b1010);    // 0b0010 -> 2 : 셋다 같은 결과
        System.out.println(0x03 & 0x0A);
        System.out.println();

        // @OR 비트 연산자
        System.out.println("or 비트 연산자 : |");
        System.out.println(3 | 10);
        System.out.println(0b0011 | 0b1010);    // 0b1011 -> 11 : 셋다 같은 결과
        System.out.println(0x03 | 0x0A);
        System.out.println();

        // @XOR 비트 연산자
        System.out.println("Xor 비트 연산자 : ^");
        System.out.println(3 ^ 10);
        System.out.println(0b0011 ^ 0b1010);    // 0b1001 -> 9 : 셋다 같은 결과
        System.out.println(0x03 ^ 0x0A);
        System.out.println();

        // @NOT 비트 연산자
        System.out.println("not 비트 연산자 : ~");
        System.out.println(~3);
        System.out.println(~0b0011);    // 0b1111...1100 -> -4
        System.out.println(~0x03);
    }
}
