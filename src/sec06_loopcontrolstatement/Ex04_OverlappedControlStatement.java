package sec06_loopcontrolstatement;

public class Ex04_OverlappedControlStatement {
    public static void main(String[] args){
        System.out.println();
        // 1. if-if 중복
        int a1 = 5;
        int a2 = 3;
        if( a1 > 5){
            if( a2 < 2 ){
                System.out.println("실행 1");
            }else{
                System.out.println("실행 2");
            }
        }else{
            System.out.println("실행 3");
        }
        System.out.println();

        // 2. switch-for 중복
        int a3 = 2;
        switch (a3){
            case 1:
                for(int k = 0; k < 10; k++){
                    System.out.print(k + " ");
                }
                break;
            case 2:
                for(int k = 10; k > 0; k--){
                    System.out.print(k + " ");  // 1까지 찍히겠지? : 10~1
                }
                break;
        }
        System.out.println();
        System.out.println();

        // 3. for-for-if 중복
        for(int i = 0; i < 3; i++){         // 3회 반복 -> 0, 1, 2
            for(int j = 0; j < 5; j++){     // 5회 반복 -> 0, 1, 2, 3, 4   -> 총 15바퀴를 도는것.
                System.out.println(i + " " + j);
                if( i == j) {
                    System.out.println("같아지는 시점 : i = j ");
                }
            }
        }
    }
}
