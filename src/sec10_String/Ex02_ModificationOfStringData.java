package sec10_String;

import java.util.Arrays;

public class Ex02_ModificationOfStringData {
    public static void main(String[] args){
        // 1. 문자열 수정(객체내의 내용 변경 불가 -> 새로운 객체 생성)
        System.out.println("1. 문자열 수정(객체내의 내용 변경 불가 -> 새로운 객체 생성)");
        String str1 = new String("Hi!");
        String str2 = str1;
        str2 = "Hello!";    // String 클래스에서만 가지고 있는 특징때문에 출력해보면 값이 다르게 나올거야
        System.out.println(str1);   // Hi!
        System.out.println(str2);   // Hello!
        System.out.println();

        // 2. 배열 참조자료형에서는? -> 둘다 변한다.
        System.out.println("2. 배열 참조자료형에서는?");
        int[] array1 = new int[] {3,4,5};
        int[] array2 = array1;
        array1[0] = 6;
        array1[1] = 7;
        array1[2] = 8;
        System.out.println(Arrays.toString(array1));
//        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);
        System.out.println(Arrays.toString(array2));
//        System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);
    }
}
