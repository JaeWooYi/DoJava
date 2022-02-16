package sec08_referencedatatype;

import java.util.Arrays;

public class Ex01_arrayDefinition {
    public static void main(String[] args){
        // 1. 배열의 선언 방법1
        int[] array1 = new int[3];  // 선언과 객체 한번에
        int[] array2;
        array2 = new int[3];    // 선언과 객체선언 따로

        // 2. 배열의 선언 방법2
        int array3[] = new int[3];
        int array4[];
        array4 = new int[3];

        // 3. 다양한 배열 선언(기본자료형, 참조자료형 배열)
        boolean[] array5 = new boolean[3];
        int[] array6 = new int[3];
        double[] array7 = new double[7];
        String[] array8 = new String[9];
    }
}
