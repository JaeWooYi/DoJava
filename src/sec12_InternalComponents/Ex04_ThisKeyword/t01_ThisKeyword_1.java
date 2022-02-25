package sec12_InternalComponents.Ex04_ThisKeyword;

// 1. 클래스의 정의 : 클래스 내부에서 필드, 메서드에 앞에 붙는 묵시적(자동으로 붙는) this키워드
class A{
    int m;
    int n;
    void init(int a, int b){
        //if : 픨드에 없는거에 this가 붙을까? -> 객체 뱃속엔 멤버만 들어갈 수 있다.
//        int c;
//        this.c = 1;   // 안된다. -> 지역변수니까
        this.m = a; // this -> 내가 속한 클래스의 이름
        n = b;      // this.(객체.)이 생략되있는거야(자동으로 붙는거야)
        System.out.println(m + "," + n);
    }
    void work() {
        this.init(1,2);
    }
}

public class t01_ThisKeyword_1 {
    public static void main(String[] args){
        // 2. 클래스 객체 생성
        A a = new A();
        // 3. 메서드 호출 / 필드값 활용
        a.init(5,6);
        a.work();
        System.out.println(a.m + " " + a.n);
    }
}
