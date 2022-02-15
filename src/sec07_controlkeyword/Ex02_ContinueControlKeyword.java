package sec07_controlkeyword;

public class Ex02_ContinueControlKeyword {
    public static void main(String[] args) {
        // 1. 단일 반복문에서 continue 사용
        for(int i = 0; i < 10; i++){
            continue;   // 증감식을 계속 실행 시키기 때문에
            //System.out.print(i + " "); // continue; 하면 unreachable 오류 발생
        }

        for(int i = 0; i < 10; i ++){
            System.out.print(i + " ");
            continue;   // continue;는 닫힌 중괄호의 역할이야 그래서 위에서는 오류가 발생 하는거지
        }
        System.out.println();
        System.out.println();

        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;   // i가 5가 된는 시점에서 닫힌 중괄호를 만난 것 처럼( break는 멈춰라, continue는 패시 시켜라)
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // 2. 다중 반복문에서 continue 사용
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(j == 3){
                    continue;   // j가 3이 되는 시점을 패스 시켜라 -> 0,1,2,4 만 반복한다.
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();
        System.out.println();

        // 3_case1 : @continue + Label(:)
        POS1: for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(j == 3){
                    continue POS1;  // j가 3인경우 패스
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
