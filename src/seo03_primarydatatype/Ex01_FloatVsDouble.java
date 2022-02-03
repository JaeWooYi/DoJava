package seo03_primarydatatype;

public class Ex01_FloatVsDouble {
    public static void main(String[] args){
        // float의 정밀도(대략 소수 7자리)
        float f1 = 1.0000001f;
        System.out.println(f1); // 정상
        float f2 = 1.00000001f;
        System.out.println(f2); // 오차

        // double의 정밀도(대략 소수 15자리)
        double d1 = 1.000000000000001;
        System.out.println(d1); // 정상
        double d2 = 1.0000000000000001;
        System.out.println(d2); // 오차
    }
}
