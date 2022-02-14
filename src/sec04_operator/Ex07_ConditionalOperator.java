package sec04_operator;

public class Ex07_ConditionalOperator {
    public static void main(String[] args) {
        // 삼항 연산자
        System.out.println();
        System.out.println("#1. 삼항 연산자");
        System.out.println("예1");
        int a1 = (3 > 5) ? 6 : 9;   // (거짓) ? x : y -> 이기 때문에 y가 찍힘
        System.out.println(a1);
        System.out.println();

        System.out.println("예2");
        int a2 = (5 > 3) ? 10 : 20; //// (참) ? x : y -> 이기 때문에 x가 찍힘
        System.out.println(a2);
        System.out.println();

        System.out.println("예3");
        int a3 = 3;
        System.out.println(a3 % 2 == 0 ? "짝수" : "홀수");  // 앞이 거짓이니까 당연히 홀수가 나오겠지?
        System.out.println();

        // cf. if-else 구문으로 변환
        System.out.println("cf. if-else 구문으로 변환");
        if(a3 % 2 == 0){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }
    }
}
