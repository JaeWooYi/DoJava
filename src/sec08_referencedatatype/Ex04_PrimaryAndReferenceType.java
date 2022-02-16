package sec08_referencedatatype;

public class Ex04_PrimaryAndReferenceType {
    public static void main(String[] args){
        // 1. 기본자료형의 대입연산(stack 값 복사)
        System.out.println("1. 기본자료형의 대입연산(stack 값 복사)");
        int a = 1;
        int b = a;
        b = 2;
        System.out.println(a);  // 1
        System.out.println(b);  // 2

        String c = "가";
        String d = c;
        d = "나";
        System.out.println(c);
        System.out.println(d);
        System.out.println();

        // 2. 참조자료형의 대입연산(stack 값 복사)
        System.out.println("2. 참조자료형의 대입연산(stack 값 복사)");
        int[] array1 = new int[] {1,2,3};
        int[] array2 = array1;
        array2[0] = 4;
        System.out.println(array1[0]);  // 4
        System.out.println(array2[0]);  // 4
        System.out.println(array1[1]);  // 2
        System.out.println(array2[1]);  // 2

    }
}
