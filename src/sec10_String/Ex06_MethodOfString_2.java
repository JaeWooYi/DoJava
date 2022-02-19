package sec10_String;

import java.util.Arrays;

public class Ex06_MethodOfString_2 {
    public static void main(String[] args){
        // 5. 문자열 수정(toLowerCase(), toUpperCase(), replace(,), subString(,), split(), trim())
        System.out.println("5. 문자열 수정");
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.replace("Study","공부"));
        System.out.println(str1.substring(0,5));    // 0 <= 5 : 0,1,2,3,4 까지 // (Java )로 출력됨. 스페이스까지

        String[] strArray = "abc/def-ghi jk1".split("/|-| ");   // -> /와 -와 스페이스를 기준으로 쪼게겠다. (|가 or을 뜻한다.)
        System.out.println(Arrays.toString(strArray));

        // trim() -> 공백제거
        System.out.println("     abc     ".trim());
        System.out.println();

        // 6. 문자열의 내용 비교(equals(), equalsIgnoreCase())
        System.out.println("6. 문자열의 내용 비교");
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");
        // 스택메모리 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);   // new 키워드니까 다 새로운 객체만들어서 저장했겠지? 다 false 나와.
        System.out.println();

        // equals() : 내용비교
        // 뭐가 나올지 예상해봐
        System.out.println("equals() : 내용비교");
        System.out.println(str2.equals(str3));  // true
        System.out.println(str3.equals(str4));  // false
        System.out.println(str4.equals(str2));  // false
        System.out.println();

        // equalsIgnoreCase() : 대소문자 구분하지말고 내용 비교
        System.out.println("equalsIgnoreCase() : 대소문자 구분하지말고 내용 비교");
        System.out.println(str2.equalsIgnoreCase(str3));    //
        System.out.println(str3.equalsIgnoreCase(str4));    //
        System.out.println(str4.equalsIgnoreCase(str2));    // 당연히 전부다 true겠지?

    }
}
