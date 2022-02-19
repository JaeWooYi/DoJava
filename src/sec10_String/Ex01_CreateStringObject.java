package sec10_String;

public class Ex01_CreateStringObject {
    public static void main(String[] args){
        // 1-1. String 객체 생성1 -> new 키워드
        System.out.println("1. String 객체 생성1-1 -> new 키워드");
        // 클래스 참조변수 = 힙메모리에넣어라 생성자();   // 생성자 뒤에는 소괄호에 나옴. ()를 넣어라라는 뜻.
        String str1 = new String("HI!");
        System.out.println(str1);
        System.out.println();

        // 1-2. String 객체 생성2 -> 리터럴 바로 넣기
        System.out.println("1-2. String 객체 생성2 -> 리터럴 바로 넣기");
        String str2 = "Hello!";
        System.out.println(str2);
        System.out.println();
        // 1-1 와 1-2은 메모리에서 차이가 있다.
    }
}
