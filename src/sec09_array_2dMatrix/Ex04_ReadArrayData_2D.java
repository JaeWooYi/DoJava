package sec09_array_2dMatrix;

public class Ex04_ReadArrayData_2D {
    public static void main(String[] args){
        // 1-1. 2차원 데이터의 배열의 길이(정방)
        System.out.println("1-1. 2차원 데이터의 배열의 길이(정방)");
        int[][] array1 = new int[2][3];
        System.out.println(array1.length);      // 행을 가르킨다. 고로 2가 나온다
        System.out.println(array1[0].length);   // 첫번째 행이 가르키는 1차원 배열의 개수. 방이 3개있자나 -> 3이 나오겠지?
        System.out.println(array1[1].length);   // 두번째 행도 방이 3개있자나 -> 3이지
        System.out.println();

        // 1-2. 2차원 데이터의 배열의 길이(비정방)
        System.out.println("1-2. 2차원 데이터의 배열의 길이(비정방)");
        int[][] array2 = new int[][] {{1,2},{3,4,5}};
        System.out.println(array2.length);      // 행의 길이
        System.out.println(array2[0].length);   // 방의 개수 2이지
        System.out.println(array2[1].length);   // 방의 개수 3이지
        System.out.println();

        // 2-1. 2차원 배열의 출력 방법
        System.out.println("2-1. 2차원 배열의 출력 방법");
        System.out.println(array2[0][0] + " " + array2[0][1]);
        System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
        System.out.println();

        // 2-2. 2차원 배열의 출력 방법(2중 포문)
        System.out.println("2-2. 2차원 배열의 출력 방법(2중 포문)");
        for(int i = 0; i < array2.length; i++){             // 행
            for(int j = 0; j < array2[i].length; j++ ){     // 열
                System.out.println(array2[i][j]);
            }
        }
        System.out.println();

        // 2-3. 2차원 배열의 출력 방법(for-each)
        // for(하나의 원소를 꺼낸을 때 저장할 변수 : 집합 객체)
        System.out.println("2-3. 2차원 배열의 출력 방법(for-each)");
        for(int[] array: array2){
            for(int k:array){
                System.out.println(k);
            }
        }
    }
}
