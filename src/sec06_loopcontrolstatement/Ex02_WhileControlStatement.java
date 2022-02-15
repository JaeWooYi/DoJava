package sec06_loopcontrolstatement;

public class Ex02_WhileControlStatement {
    public static void main(String[] args){
        // 1. while 의 기본 문법 구조
        int a = 0;                          // 초기식 -> 필수 x
        while(a < 10){                      // 조건식
            System.out.print(a + " ");    // 실행구문 -> 9까지 나오겠지?
            a++;                            // 증감식 -> 필수 x
        }
        System.out.println();
        System.out.println();

        // for 문으로 변환
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        int b = 10;
        while(b > 0){
            System.out.print(b + " ");  // 1까지 나오겠지?
            b--;
        }
        System.out.println();
        System.out.println();

        // for 문으로 변환
        for(int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. while 문으로 만든 무한 루프
        /*
        while (true){
            System.out.println("무한 루프");
        }
        */
        System.out.println();

        // 3. 무한 루프 탈출
        int c = 0;
        while (true){   // 항상 참이니까 무한루프가 되겠지?
            if(c > 10){
                break;      // 하지만 조건을 걸어서 탈출을 하게 한다
            }
            System.out.print(c + " ");  // c가 11이 되면 탈출이니까, 10 까지 찍힌다
            c++;
        }
    }
}
