package Z_reviewLesson;

public class review03 {
    public static void main(String[] args) {
        System.out.println("1-----");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.println(i + " " + j);
                if(i == j){
                    System.out.println("i와 j가 같아지는 시점");
                }
            }
        }
        System.out.println();

        System.out.println("2-----");
        for(int k = 0; k < 10; k++){
            System.out.print(k + " ");
            break;  // 0찍고 탈출
        }
        System.out.println();

        for(int k = 0; k < 10; k++){
            if(k == 5){
                break;
            }
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println();
        for(int p = 0; p < 5; p++){
            for(int i = 0; i < 5; i++){
                if(i == 3){
                    break;
                }
                System.out.println(p + " " + i);
            }
        }
        System.out.println();

        for(int a = 0; a < 10; a++){
            if(a == 5) {
                continue;
            }System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

        for(int ab = 0; ab < 5; ab++){
            for(int ac = 0; ac < 5; ac++){
                if(ab == 3){
                    continue;
                }
                System.out.println(ab + " " +ac);
            }
        }
    }
}
