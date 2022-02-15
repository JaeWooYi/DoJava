package sec06_loopcontrolstatement;

public class Ex03_DoWhileControlStatement {
    public static void main(String[] args){
        // 1. 반복 횟수가 0 일때, do-while 문과 while문의 비교
        int a = 0;
        while(a < 0){
            System.out.print(a + " ");  // 공란이 출력 되는거야
            a++;
        }   // 실행 횟수 0번
        System.out.println();

        System.out.println("kkk");
        a = 0;
        do{
            System.out.print(a + " ");
            a++;
        }while (a < 0); // 실행 횟수 1번 : 0회 일때 do-while문은 무조건 1번은 실행을 시킨다
        System.out.println();
        System.out.println();


        // 2. 반복 횟수가 1일 때 do-while 문과 while 문 비교 -> 1회 이상일 경우에는 2경우 실행 횟수가 같다.
        a = 0;
        while(a < 1){
            System.out.print(a + " ");
            a++;
        }   // 실행 횟수 1번
        System.out.println();
        System.out.println();

        a = 0;
        do{
            System.out.print(a + " ");
            a++;
        }while(a < 1);  // 실행 횟수 1번
        System.out.println();
        System.out.println();

        // 3. 반복 횟수가 10 일 때 do-while 문 비교
        a = 0;
        while (a < 10){
            System.out.print(a + " ");
            a++;
        }   // 실행 횟수 10번
        System.out.println();
        System.out.println();
        a = 0;
        do{
            System.out.print(a + " ");
            a++;
        }while(a < 10); // 실행 횟수 10번
        System.out.println();
    }
}
