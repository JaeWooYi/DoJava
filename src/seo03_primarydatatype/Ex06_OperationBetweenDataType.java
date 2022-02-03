package seo03_primarydatatype;

public class Ex06_OperationBetweenDataType {
    public static void main(String[] args){
        // 같은 자료형 간의 연산
        int a = 3 + 5;
        int b = 8 / 5;  // -> int/int = int
        float c = 3.0f + 5.0f;
        double d = 8.0 / 5.0;

        byte data1 = 3;
        byte data2 = 5;
        // byte data3 = data1 + data2; -> data1 + data2 는 int형 이므로 오류
        int e = data1 + data2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println();

        // 다른 자료형 간의 연산
        // int f = 5 + 3.5; -> double형태 이므로 오류
        double g = 5 + 3.5;
        int h  = 5 + (int)3.5;

        double i = 5 / 2.0;
        byte data3 = 3;
        short data4 = 5;
        int l = data3 + data4;
        double m = data3 + data4;   // -> data3 + data4는 int형 이므로 자동타입 변환

        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(l);
        System.out.println(m);
    }
}
