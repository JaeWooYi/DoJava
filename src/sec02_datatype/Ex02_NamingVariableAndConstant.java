package sec02_datatype;

public class Ex02_NamingVariableAndConstant {
    public static void main(String[] args){
        // 변수
        boolean aBcD;   // 대문자는 새로운 단어의 앞 글자에 사용 권장
        byte 가나다;   // 한글로 작성 가능(권장 x)
        short _abcd;
        char $ab_cd;
        // int 3abcd;   // 숫자는 이름 맨 앞 x
        long abcd3;
        // float ing;   // 자바 예약어는 사용 불가
        double main;
        // int my Work; // 스페이스 불가
        String myClassName;
        int ABC;    // 전부 대문자 가능(권장 x) -> 상수로 인식 하기 때문에
//        final int ABC = 7;  // 상수 : final

        // 상수
        final double PI;
        final int MY_DATA;
        final float myData; // 소문자 사용(권장 x) -> 변수이름 규칙이기 때문

//        abc();                    // 메서드 호출하는 법
//        System.out.println(abc);    // 메서드와 변수의 이름은 같아도 된다
    }
}
