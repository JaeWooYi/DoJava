package sec03_primarydatatype;

public class Ex04_TypeCasting_1 {
    public static void main(String[] args){
        // 캐스팅 방법1 : 자료형
        int a = (int)5.3;   // -> 값이 5로 표기
        long b = (long)10;
        float c = (float)5.8;
        double d = (double)16;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println();

        // 캐스팅 방법2 : L, F
        long e = 10L;
        long f = 10l;   // 위와동일
        double g = 5.8F;
        double h = 5.8f;    // 위와동일
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
