package sec07_controlkeyword;

public class Ex01_BreakControlKeyword {
    public static void main(String[] args) {
        // 1. 단일 반복문 탈출
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");  // 0~9
            break;  // 0 찍자 마자 탈출
        }
        System.out.println();
        System.out.println();

        for(int i = 0; i < 10; i++){
            if(i == 5){
                break;  // 5가 될 때 탈출하기 때문에 0~4까지 찍힌다.
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // 2. 다중 반복문 탈출
        // @1개의 반복문만 탈출할 때
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if( j== 2){ // j는 0,1 - 0,1 - 0,1 ... 만 찍히겠지?
                    break;  // j가 2가 되는 순간 탈출, 하나의 반복만 탈출
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();

        // 3_case1 : @break + Label(:) 문으로 다중 반복문 탈출 (다중 반복문을 한번에 탈출)
        POS1: for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if( j == 2){
                    break POS1; // j가 2가 되는 순간 POS1 자체를 탈출
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();

        // 3_case2 : @변수값을 조정해 다중 반복문 탈출
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(j == 2){
                    i = 100;    // 조건문 자체가 false가 되도록
                    break;      // j가 2가 될때 i가 조건자체를 틀리도록
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();
    }
}
