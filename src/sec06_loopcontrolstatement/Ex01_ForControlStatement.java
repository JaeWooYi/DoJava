package sec06_loopcontrolstatement;

public class Ex01_ForControlStatement {
    public static void main(String[] args) {
        // for 문 기본 문법 구조
        int a1;  // for 문의 반복 횟수를 지정하는 변수를 외부에서 선언
        for(a1 = 0; a1 < 3; a1++){
            System.out.println(a1 + " ");
        }
        System.out.println();

        for(int a2 = 0; a2 < 3; a2++){  // int a2 = 0; -> for 문의 반복 횟수를 지정하는 변수를 초기식에서 선언
            System.out.println(a2 + " ");
        }
        System.out.println();

        for(int a2 = 0; a2 < 100; a2++){
            System.out.println(a2 + " ");
        }
        System.out.println();

        for(int a2 = 10; a2 > 0; a2--){
            System.out.println(a2 + " ");
        }
        System.out.println();

        for(int a2 = 0; a2 < 10; a2+= 2){
            System.out.println(a2 + " ");
        }
        System.out.println();

        for(int a2 = 0, a3 = 0; a2 < 0; a2++, a3++){
            System.out.println(a2 + a3 + " ");
        }
        System.out.println();

        // for 문의 특수한 형태(무한루프)
        /*
        System.out.println("for 문의 특수한 형태(무한루프)");
        for(int a2 = 0; ;a2++){
            System.out.println(a2 + " ");
        }
        for(;;){
            System.out.println("무한루프");
        }
        */
        System.out.println();

        // 무한루프 탈출
        for(int a2 = 0; ; a2++){
            if(a2 > 10){
                break;
            }
            System.out.println(a2 + " ");
        }
        System.out.println("무한 루프 탈출");
    }
}
