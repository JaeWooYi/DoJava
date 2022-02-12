package sec01_basicsyntax;

public class Ex03_ConsoleOutput {
    public static void main(String[] ar){
//        System.out.println();
        System.out.println("화면출력");
        System.out.println("화면" + "출력");
        System.out.println(3.8);
        System.out.println(3+5);
        System.out.println("화면" + 3);
        System.out.println("화면" + 3 + 5);
        System.out.println(3 + 5 + "화면");
        System.out.println();

        int a = 3;
        String b = "screen";
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
        System.out.println();

        System.out.print("screen");
        System.out.print(" print");
        System.out.print(" 1");
        System.out.print("\n"); // \은 개행을 하여라라는 의미이다
        System.out.print("screen");
        System.out.print(" print");
        System.out.print(" 2");
        System.out.println();

        System.out.printf("%d\n", 30);            // %d : 10진수, 30이라는 알규먼트(arg)를 %d에 넣어라
        System.out.printf("%o\n", 30);            // %o : 8진수
        System.out.printf("%x\n", 30);            // %x : 16진수
        System.out.printf("%s\n", "출력");        // %s : 문자열
        System.out.printf("%f\n", 5.8);          // %f : 실수
        System.out.printf("%4.2f\n", 5.8);       // ex) %4.2f -> 앞자리 4개까지, 소수점 2개까지
        System.out.printf("%d과%f\n", 30, 10.9); // argument 여러개도 이런식으로 가능!!
    }
}
