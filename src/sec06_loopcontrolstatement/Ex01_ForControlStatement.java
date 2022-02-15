package sec06_loopcontrolstatement;

public class Ex01_ForControlStatement {
    public static void main(String[] args) {
        // 1. for 문 기본 문법 구조
        int a1;  // for 문의 반복 횟수를 지정하는 변수를 외부에서 선언
        for(a1 = 0; a1 < 3; a1++){
            System.out.println(a1 + " ");   // 예상을 해봐 뭐가 나올지! 0, 1, 2
        }
        System.out.println();

        // 변수의 선언을 초기식 내부에 명시하기! 위 코드와 동일
        for(int a2 = 0; a2 < 3; a2++){  // int a2 = 0; -> for 문의 반복 횟수를 지정하는 변수를 초기식에서 선언
            System.out.println(a2 + " ");
        }
        System.out.println();

        for(int a2 = 0; a2 < 100; a2++){
            System.out.println(a2 + " ");   // 0~ 99까지 나오겟지?
        }
        System.out.println();

        for(int a2 = 10; a2 > 0; a2--){
            System.out.println(a2 + " ");   // 10~1까지
        }
        System.out.println();

        for(int a2 = 0; a2 < 10; a2+= 2){   // a2 = a2 + 2라는 뜻 : 2씩 커지겠지 10보다 작을 때 까지
            System.out.println(a2 + " ");   // 0 ~ 8
        }
        System.out.println();
        System.out.println("kkk");

        for(int a2 = 0, a3 = 0; a2 < 10; a2++, a3++){   // 0+0 , 1+1, 2+2, ..., 9+9 까지 나온다
            System.out.println(a2 + a3 + " ");
        }
        System.out.println();

        System.out.println("for 문의 특수한 형태(무한루프)");
        // 2. for 문의 특수한 형태(무한루프)
        /*
        // 1.
        for(int a2 = 0; ;a2++){
            System.out.println(a2 + " ");
        }
        // 2.
        for(;;){    // ((생략);(생략);(생략))
            System.out.println("무한루프");
        }
        */
        System.out.println("끝");
        System.out.println();

        // 3. 무한루프 탈출
        for(int a2 = 0; ; a2++){
            if(a2 > 10){
                break;  // break를 통한 무한 루프 탈출.
            }
            System.out.println(a2 + " ");   // -> 0 ~ 10 까지 나온다. 왜 10일까? a2 > 10인데
        }                                   // 왜냐면 a2가 11일 때까지 참이기 때문이야.
        System.out.println("무한 루프 탈출");
    }
}
