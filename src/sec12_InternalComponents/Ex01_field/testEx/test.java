package sec12_InternalComponents.Ex01_field.testEx;

import java.util.Arrays;

public class test {

    // 메인
    public static void main(String[] args) {
        // 1.
        print();
        // 2.
        printArray(new int[]{1,2,3});
        // printArray({1,2,3}); -> 오류 : 배열의 선언/초기화 참조
    }

    // 1.
    public static void print(){
        System.out.println("안녕");
    }

    // 2.
    public  static void printArray(int a[]){
        System.out.println(Arrays.toString(a));
    }

}
