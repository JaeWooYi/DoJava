package sec12_InternalComponents.Ex02_Method;

import java.util.Arrays;

public class m03_ArrayArgumentMethod {
    public static void main(String[] args) {
        //1. 배열을 매개변수로 가지는 메서드 호출
//        int[] a = new int[]{1,2,3};
//        printArray(a);
        // 위처럼 나눠서 해도 되.
        printArray(new int[]{1,2,3});
    }
    public static void printArray(int[] a){
        System.out.println(Arrays.toString(a));
    }
}
