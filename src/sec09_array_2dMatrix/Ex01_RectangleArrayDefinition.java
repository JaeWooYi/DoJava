package sec09_array_2dMatrix;

public class Ex01_RectangleArrayDefinition {
    public static void main(String[] args){
        // 2차원배열
        // 1. 배열의 선언 방법1 (가장 많이 쓰임 : 권고 사항)
        int[][] array1 = new int[3][4]; // 3행 4열을 만든다
        // 배열의 선언 방법1(나눠서 하기도 가능)
        int[][] array2;
        array2 = new int[3][4];

        // 2. 배열의 선언 방법2
        int array3[][] = new int[3][4];
        int array4[][];
        array4 = new int[3][4];

        // 3. 배열의 선언 방법3
        int[] array5[] = new int[3][4];
        int[] array6[];
        array6 = new int[3][4];

        // 4. 다양한 배열 선언(기본 자료형, 참조 자료형)
        boolean[][] array7 = new boolean[3][4];
        int[][] array8 = new int[2][4];
        double[][] array9 = new double[3][5];
        String[][] array10 = new String[2][6];  // 참조 자료형
    }
}
