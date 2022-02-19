package sec10_String;

public class Ex03_SharingStringObject {
    public static void main(String[] args){
        // 1. 문자열 객체 공유(리터럴로 객체를 생성한 경우 : 공유) -> new키워드를 사용할 경우 객체를 공유하지 않는다.
        // System.out.println("1. 문자열 객체 공유(리터럴로 객체를 생성한 경우 : 공유)");
        String str1 = new String("HI!");
        String str2 = "HI!";    // str1과 str2는 힙메모리 내에서 다른 객체를 가르킨다.
        String str3 = "HI!";    // str2와 str3는 리터럴로 만들었기 때문에 같은 객체를 공유한다.
        String str4 = new String("HI!");    // 그렇다면 str1과 str4는 같은 객체를 공유할까? -> 아니 new키워드를 사용했기 때문에 달라.

        // 2. stack 메모리 비교(==)  -> 위주석이 정말 옳은 말인지 비교해보자!!
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str1);
    }
}
