package sec04_operator;

public class Ex07_ConditionalOperator {
    public static void main(String[] args) {
        // 삼항 연산자
        int a1 = (3 > 5) ? 6 : 9;
        System.out.println(a1);
        System.out.println();

        int a2 = (5 > 3) ? 10 : 20;
        System.out.println(a2);
        System.out.println();

        int a3 = 3;
        System.out.println(a3 % 2 == 0 ? "짝수" : "홀수");
        System.out.println();

        // cf. if-else 구문으로 변환
        if(a3 % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }
    }
}
