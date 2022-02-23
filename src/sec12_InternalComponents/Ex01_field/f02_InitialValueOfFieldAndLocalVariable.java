package sec12_InternalComponents.Ex01_field;

// 1.  클래스 생성(정의)
class A2 {
    boolean m1;
    int m2;
    double m3;
    String m4;

    void printFieldValue(){
        System.out.println(m1); // 초기값 : false
        System.out.println(m2); // 초기값 : 0
        System.out.println(m3); // 초기값 : 0.0
        System.out.println(m4); // 초기값 : null -> 객체를 가리키지 않고 있다.
    }

    void printLocalVariable() {
        int k;
        //System.out.println(k);    // k는 지역 변수, 값을 초기화 하지 않았기 때문에 오류.
    }
}
public class f02_InitialValueOfFieldAndLocalVariable {
    public static void main(String[] args) {
        // 2. class를 활용 하여 객체 생성
        A2 a = new A2();

        // 3. 객체 활용
        a.printFieldValue();    // 말하고자 하는 바는 필드값은 초기값을 지정 따로 안해도 됨.
    }
}
