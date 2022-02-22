package Z_reviewLesson;

public class review02 {
    public static void main(String[] args){
        // if문
        System.out.println("1-----");
        int a = 89;
        if(a > 100){
            System.out.println("false");
        }if(a < 100){
            System.out.println("true");     // if문 돌렸을때 여기꺼가 출력되겠지?
        }
        System.out.println();

        // 앞서했던 if-else 구문을 다시한번 해보자
        System.out.println("2-----");
        if(a > 100){
            System.out.println("true");
        }else{
            System.out.println("false");    // 거짓이니까 false가 나올거야
        }
        // 그럼 이걸 삼항연산자로 바꿔서 쓸수도 있어야겠지?
        System.out.println(a > 100 ? "참" : "거짓");
        System.out.println();

        // if - else if, -else if... else if는?
        System.out.println("3-----");
        int score;
        score = 89;
        if(score >= 90){
            System.out.println("A");
        }else if(score >=80){
            System.out.println("B");
        }else if(score >=70){
            System.out.println("C");
        }       // 출력결과 뭐 나오겠어? 당연히 B지, 근데 B가 출력되면서 밑에있는건 아예 읽지 조차 않아
        System.out.println();

        // no break
        System.out.println("4-----");
        System.out.println("no break");
        int a1 = 3;
        switch (a1){
            case 1 :
                System.out.println(1);
            case 2 :
                System.out.println(2);
            case 3 :
                System.out.println(3);
            case 4 :
                System.out.println(4);
            case 5 :
                System.out.println(5);
        }   // 3, 4, 5가 나오지 바보야 break 없으니까 밑에꺼 전부 바보야
        System.out.println("break");
        switch (a1){
            case 1 :
                System.out.println(1);
                break;
            case 2 :
                System.out.println(2);
                break;
            case 3 :
                System.out.println(3);
                break;
            case 4 :
                System.out.println(4);
                break;
            case 5 :
                System.out.println(5);
                break;      // 이래야 3만나오지
        }
        System.out.println();

        // for 기본구조
        System.out.println("5-----");
        for(int k = 10; k<50; k *= 2){
            System.out.print(k + " ");  // 40 까지 나오겠지
        }
        System.out.println();
        System.out.println();

        // while 구조
        System.out.println("6-----");
        // Ex02_WhileControlStatement 부터해
        System.out.println("6_1");
        int k = 0;
        while(k < 10){
            System.out.print(k + " ");
            k++;
        }
        System.out.println();
        System.out.println("6_2");
        // for문으로 바꿔서 써봐 위에 와일문
        for(k = 0; k < 10; k++){
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
