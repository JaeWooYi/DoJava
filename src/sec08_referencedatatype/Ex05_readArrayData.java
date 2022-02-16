package sec08_referencedatatype;

import java.util.Arrays;

public class Ex05_readArrayData {
    public static void main(String[] args) {
        // 1. 배열의 길이 구하기
        System.out.println("1. 배열의 길이 구하기");
        int[] array1 = new int[] {1,2,3,4,5};
        System.out.println(array1.length);  // .length : 읽기 전용(길이)

        System.out.println();

        // 2-1. 배열의 원소 출력하기 1(수동)
        System.out.println("2-1. 배열의 원소 출력하기 1");
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);
        System.out.println(array1[4]);

        System.out.println();

        // 2-2. 배열의 원소 출력하기 2(반복문)
        System.out.println("2-2. 배열의 원소 출력하기 2");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        System.out.println();

        // 2-3. 배열의 원소 출력하기 3(for-each)
        System.out.println("2-3. 배열의 원소 출력하기 3(for-each)");
//        for(꺼낸 하나의 원소를 저장할 수 있는 변수:집합객체) {} // -> for-each구문
        for(int k : array1){
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.println();

        // 3. 출력하기 3 -> []로 안에 나온다.
        System.out.println("3. 출력하기 3");
        System.out.println(Arrays.toString(array1));
    }
}
