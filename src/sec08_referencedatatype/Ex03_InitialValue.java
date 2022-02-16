package sec08_referencedatatype;

import java.util.Arrays;

public class Ex03_InitialValue {
    public static void main(String[] args){
        // 1. stack 메모리 값(강제초기화 되지 않음)
        System.out.println("1. stack 메모리 값(강제초기화 되지 않음)");
        int a;
//        System.out.println(a);    // 오류 : 스택메모리에 빈칸으로 존재 -> 값을 읽어오는건 불가(비워져 있으니까)
        int[] b;
//        System.out.println(b);    // 오류 : 스택메모리에 빈칸으로 존재 -> 값을 읽어오는건 불가(비워져 있으니까)

        int c = 0;  // 임의의 값으로 초기화
        System.out.println(c);  // 스택메모리안에 값이 들어가있을테니까 값이 나옴

        int[] d = null; //  null로 초기화
        System.out.println(d);
        System.out.println();

        // 2. heap 메모리의 초기화(강제 초기화) -> 참조자료형만 해당
        // 기본자료형 배열
        System.out.println("2-1. heap 메모리의 초기화(강제 초기화) : 기본자료형 배열");
        boolean[] e = new boolean[3];       // 초기값 false -> boolean은 0
        for(int i = 0; i < 3; i++){
            System.out.print(e[i] + " ");
        }
        System.out.println();

        int[] f = new int[3];               // 초기값 0 -> 정수는 0
        for(int i = 0; i < 3; i++){
            System.out.print(f[i] + " ");
        }
        System.out.println();

        double[] g = new double[3];               // 초기값 0 -> 실수는 0.0
        for(int i = 0; i < 3; i++){
            System.out.print(g[i] + " ");
        }
        System.out.println();
        System.out.println();

        // 참조자료형 배열일 경우
        System.out.println("2-2. heap 메모리의 초기화(강제 초기화) : 참조자료형 배열");
        String[] h = new String[3];         // 초기값 null -> String은 null
        for(int i = 0; i < 3; i++){
            System.out.print(h[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Tip. 배열을 쉽게 출력하는 방법 -> Arrays.toString(배열의 객체)
        // for문을 안써도 되는구나
        System.out.println("Tip. 배열을 쉽게 출력하는 방법");
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));
        System.out.println(Arrays.toString(g));
        System.out.println(Arrays.toString(h));
    }
}
