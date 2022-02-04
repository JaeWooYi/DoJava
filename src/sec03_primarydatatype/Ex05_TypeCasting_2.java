package sec03_primarydatatype;

public class Ex05_TypeCasting_2 {
    public static void main(String[] args){
        // 자동 타입 변환
        float a = 1;    // int -> float(업캐스팅)
        long b = 2;     // int -> long(업캐스팅)
        double c = 3;   // int -> double(업캐스팅)
        byte d = 9;     // int -> byte
        short e = 11;   // int -> short

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println();

        // 수동 타입 변환
        byte f = (byte)128;     // int -> byte(다운캐스팅)
        int g = (int)3.5;       // double -> int(다운캐스팅)
        float h = (float)7.5;   // double -> float(다운캐스팅)
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
