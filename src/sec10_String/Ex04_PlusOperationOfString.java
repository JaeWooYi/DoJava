package sec10_String;

public class Ex04_PlusOperationOfString {
    public static void main(String[] args) {
        // 1. 문자열 + 문자열
        System.out.println("1. 문자열 + 문자열");
        String str1 = "Hi" + " JW" + "!";
        System.out.println(str1);

        String str2 = "hi";
        str2 += " JW";
        str2 += "!";
        System.out.println(str2);
        System.out.println();

        // 2. 문자열 + 기본자료형, 기본자료형 + 문자열
        System.out.println("2. 문자열 + 기본자료형, 기본자료형 + 문자열");
        String str3 = "HI" + 1 + 2;
//        String str4 = "HI" + String.valueOf(1) + String.valueOf(2); 위코드를 길게 늘여 쓰면
        String str4 = 1 + 2 + "HI";     // 위 두개를 비교해봐
        System.out.println(str3);   // 문자열이 앞일경우 뒤에도 문자열로 출력되. 알겠지?
        System.out.println(str4);
        System.out.println();

        // 3. 문자열과 기본자료형의 혼용
        System.out.println("3. 문자열과 기본자료형의 혼용");
        String str5 = 1 + 2 + "HI" + 1 + 2;
        System.out.println(str5);   // 뭐가 나올지 예상해봐 // 3HI12
    }
}
