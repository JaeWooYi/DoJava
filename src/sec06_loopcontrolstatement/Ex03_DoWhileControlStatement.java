package sec06_loopcontrolstatement;

public class Ex03_DoWhileControlStatement {
    public static void main(String[] args){
        // 반복 횟수가 0 일떄 do-while 문과 while문의 비교
        int a = 0;
        while(a < 0){
            System.out.println(a + " ");
            a++;
        }   // 실행 횟수 0번
        System.out.println();
        a = 0;
        do{
            System.out.println(a + " ");
            a++;
        }while (a < 0); // 실행 횟수 1번
        System.out.println();

        // 반복 횟수가 1일 떄 do-while 문과 while 문 비교
        a = 0;
        while(a < 1){
            System.out.println(a + " ");
            a++;
        }   // 실행 횟수 1번
        System.out.println();
        a = 0;
        do{
            System.out.println(a + " ");
            a++;
        }while(a < 1);  // 실행 횟수 1번
        System.out.println();

        // 반복 횟수가 10 일 때 do-while 문 비교
        a = 0;
        while (a < 10){
            System.out.println(a + " ");
            a++;
        }   // 실행 횟수 10번
        System.out.println();
        a = 0;
        do{
            System.out.println(a + " ");
            a++;
        }while(a < 10); // 실행 횟수 10번
    }
}
