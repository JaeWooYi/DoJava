package sec12_InternalComponents.Ex02_Method;

import java.util.Arrays;

public class m07_FlexibleSizeArrayArgument {
    public static void main(String[] args) {
        method1(1,2);
        method1(1,2,3);
        method1();
        System.out.println();
        method2("good", "bye");
        method2("good", "bye","JW");
        method2();
        // 위에 method1 과 method2 처럼 만들면 오버로딩 너무 많아 귀찮아. 가변길이를 사용한다면?
        // method3을 통해 알아보자
        System.out.println();
        method3(4,5,6,7,8);
        System.out.println();
        System.out.println();
        method4("안녕","더","노력해");
    }
    // int[] values = net int[2]; -> values라는건
    public static void method3(int...values){   // ...을쓰면된다(가변길이)
        System.out.println("배열의 길이 : " + values.length);
        System.out.println(Arrays.toString(values));    // 그렇기때문에 Arrays.toString 으로
        for(int k : values){
            System.out.print(k + " ");
        }
        System.out.println();
        for(int i = 0; i < values.length; i++){
            System.out.print(i + " ");
        }
    }

    public static void method4(String...value){
        System.out.println("배열의 길이2 : " + value.length);
        System.out.println(Arrays.toString(value));
        for(String z : value){
            System.out.print(z + " ");
        }
    }

    public static void method1(int a, int b){
        System.out.println(a + b);
    }
    public static void method1(int a, int b, int c){
        System.out.println(a + " " + b + " " + c);
    }
    public static void method1(){
        System.out.println("-----");
    }

    public static void method2(String a, String b){
        System.out.println(a + " " +b);
    }
    public static void method2(String a, String b, String c){
        System.out.println(a + " " + b + " " + c);
    }
    public static void method2(){
        System.out.println("-----");
    }
}
