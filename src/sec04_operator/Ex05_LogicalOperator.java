package sec04_operator;

public class Ex05_LogicalOperator {
    public static void main(String[] args) {
        // 논리 연산자
        // @AND(&&) -> 둘다 true일때 : true
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true && (5 < 3));
        System.out.println((5 <= 5) && (7 > 2));
        System.out.println();

        // @OR(||) -> 둘중 하나만 true일때 : true
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || (5 < 3));
        System.out.println((5 <= 5) || (7 >2));
        System.out.println();

        // @XOR(^) -> 2개가 다를때 : true, 2개가 같을때 : false
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ (5 < 3));
        System.out.println((5 <= 5) ^ (7 > 2));
        System.out.println();

        // @NOT(!)
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(false || !(5 < 3));      // false or true -> true
        System.out.println((5 <= 5) || !(7 > 2));   // true or false -> true
        System.out.println();

        // 비트 연산자로 논리 연산 수행
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(true | (5 < 3));
        System.out.println((5 <= 5) | (7 > 2));
        System.out.println();

        // @쇼트 서킷 사용 여부(논리 연산자는 O(숏서킷 사용), 비트 연산자 X(숏서킷 사용안함))
        int a = 3;
        System.out.println(false && ++a > 6);   // 수행 x.
        System.out.println(a);
        System.out.println("수행x");
        System.out.println();

        int b = 3;
        System.out.println(false & ++a > 6);    // 수행 o.
        System.out.println(b);
        System.out.println("수행o");
        System.out.println();

        int c = 3;
        System.out.println(true || ++c > 6);   // 수행 x.
        System.out.println(c);
        System.out.println("수행x");
        System.out.println();

        int d = 3;
        System.out.println(true | ++d > 6);    // 수행 o.
        System.out.println(d);
        System.out.println("수행o");
        System.out.println();
    }
}
