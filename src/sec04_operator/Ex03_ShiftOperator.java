package sec04_operator;

public class Ex03_ShiftOperator {
    public static void main(String[] args) {
        // 산술 시프트(부호 변화가 없다 , *2 or /2의 효과)
        // @ << : Left shift
        System.out.println("@ << : Left shift");
        System.out.println(3 << 1);     // 6
        System.out.println(-3 << 1);    // -6
        System.out.println(3 << 2);     // 12
        System.out.println(-3<< 2);     // -12
        System.out.println();

        // @ >> : Right shift
        System.out.println("@ << : Right shift");
        System.out.println(5 >> 1);     // 2
        System.out.println(-5 >> 1);    // -3
        System.out.println(5 >> 2);     // 1
        System.out.println(-5 >> 2);    // -2
        System.out.println();

        // 논리 시프트(>>>) : 비트를 이동만 시키는것
        System.out.println("@ << : 논리 shift");
        System.out.println(3 >>> 1);    // 0000...0011 -> 0001 , 양수일때는 Right shift랑 같음
        System.out.println(-3 >>> 31);  // 1111...1101 -> 0001
    }
}
