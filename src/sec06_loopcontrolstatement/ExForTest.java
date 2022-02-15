package sec06_loopcontrolstatement;

public class ExForTest {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){             // i가 0~4까지
            for(int j = 0; j < 3; j++){         // j가 0~2까지 -> 위까지 합하여 총 15회
                if(i == 2){
                    continue;
                }
                if(j == 2){
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
