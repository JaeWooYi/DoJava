package sec10_String;

import java.util.Arrays;

public class Ex05_MethodOfString_1 {
    public static void main(String[] args) {
        // 1. 문자열의 길이 (length())
        System.out.println("1. 문자열의 길이 (length())");
        String str1 = "Hi JaeWoo!";
        String str2 = "안녕하세요? 반갑습니다!";
        System.out.println(str1.length());  // 0부터 새는거고 스페이스도 1개로 치는거야
        System.out.println(str2.length());
        System.out.println();

        // 2. 문자열 검색(charAt(), indexOf(), lastIndexOf())
        System.out.println("2. 문자열 검색(charAt(), indexOf(), lastIndexOf())");
        System.out.println(str1.charAt(3)); // index가 0부터 시작하니까 3번째꺼가 나오겠지?
        System.out.println(str1.indexOf('J'));  // J라는 것이 몇번째 인덱스에 있어를 물어보는 것.(첫번째꺼 찾으면 끝내, 같은 글자가 뒤에있으면 안세고)
        System.out.println(str1.lastIndexOf('a'));  // a라는 것 뒤에서 부터 -> 이경우 a가 중복값이 뒤에 없기 때문에 그냥 indexOf랑 같은 값이 나오겠지? 째리양
        System.out.println(str1.indexOf("JaeWoo!"));    // 문자열 찾기도 가능
        System.out.println(str1.lastIndexOf("Hi"));
        System.out.println(str2.indexOf("kkk"));    // -> 찾는 문자열이 없을 때는 -1을 리턴한다.
        System.out.println();

        // 3. 문자열 변환 및 연결(String.valueOf(), concat())
        System.out.println("3. 문자열 변환 및 연결(String.valueOf(), concat())");
        // String.valueOf(기본자료형) : 기본자료형 -> String
        String str3 = String.valueOf(2.3); // -> double을 문자열로 바꿈.
        String str4 = String.valueOf(false);
        System.out.println(str3);
        System.out.println(str4);
        // concat은 그냥 +야
        String str5 = str3.concat(str4);
        System.out.println(str5);

        // 결국 concat은 아래 둘 코드가 같음을 의미함.
        String str6 = "안녕" + 3;
        String str7 = "안녕".concat(String.valueOf(3));
        System.out.println();

        // 4. 문자열 -> byte[] : getBytes(), char[] : toCharArray() 로 쪼개는 방법.
        System.out.println("4. 문자열 -> byte[], char[]로 쪼개는 방법.");
        String str8 = "Hello Java!";
        String str9 = "안녕하세요";
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
