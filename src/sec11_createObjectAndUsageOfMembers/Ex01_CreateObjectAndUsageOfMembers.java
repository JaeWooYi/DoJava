package sec11_createObjectAndUsageOfMembers;

// 1. 클래스의 구성 (정의) : 붕어빵 기계 만들기
class A {   // 클래스 정의
    int m = 3;  //  필드 정의

    void print(){   // 메서드 정의
        System.out.println("객체의 생성 및 활용");
    }
}

public class Ex01_CreateObjectAndUsageOfMembers {
    public static void main(String[] args){

        // 2. 클래스로 부터 객체 생성 : 붕어빵을 만든 것
        A a = new A();  // 객체 생성

        // 3. 클래스 멤버 활용(필드 활용 : 필드값 읽기/쓰기, 메서드 활용 : 메서드를 호출한다는 뜻) : 붕어빵을 먹기
        a.m = 5;    // 5를 필드값에 썻다(넣음).
        System.out.println(a.m);    // 5

        // 메서드 사용하기(호출)
        a.print();  // 객체의 생성 및 활용
    }
}
