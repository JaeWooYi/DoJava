package Z_reviewLesson;

public class review01 {
    public static void main(String[] args){
        // 전위
        System.out.println("1-----");
        int a = 3;
        ++a;
        System.out.println(a);  // 뭐가 나오겠어 4
        System.out.println();

        // 후위
        System.out.println("2-----");
        int b = 1;
        b++;
        System.out.println(b);  // 당연히 2겠지?
        System.out.println();

        // 후위 데이터 저장순서
        System.out.println("3-----");
        int c1 = 5;
        int c2 = c1++;
        System.out.println(c1); // 6
        System.out.println(c2); // 5
        System.out.println();

        // 전위 데이터 저장순서
        System.out.println("4-----");
        int c3 = 7;
        int c4 = ++c3;
        System.out.println(c3); // 8
        System.out.println(c4); // 8
        System.out.println();

        // 전위와 후외가 섞여있다면?
        System.out.println("5-----");
        int a1 = 5;
        int a2 = 6;
        int a3 = 1 + --a1 + 4 + a2++;
        System.out.println(a1); // 4
        System.out.println(a2); // 7
        System.out.println(a3); // 1 + 4 + 4 + 6 = 15
        System.out.println();

        // 삼항 연산자
        System.out.println("6-----");
        // (true or false) ? x(참일때) : y(거짓일때) -> 의 형태다.
        int k = (a1 > 3) ? 0 : 1;
        System.out.println(k);  // a1은 위에값을 보면 알겠지만 4야, true지? 고로 출력값은 0
        System.out.println(a1 > 10 ? "참" : "거짓");   // 조건이 거짓이자나 출력값 뭐나오겠어. 거짓이지?
        System.out.println();

        // 그럼 삼항연산자를 if-else 구문으로 바꿔보자
        System.out.println("7-----");
        if(a1 > 3){
            System.out.println(0);
        }else{
            System.out.println(1);  // 잘했어
        }
    }
}
