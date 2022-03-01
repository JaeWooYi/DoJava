package sec16_MethodOverriding.o2_OverlapMember;

class AA {
    static int m = 1;
}

class BB extends AA {
    static int m = 2;
}

public class o02_OverlapStaticField {
    public static void main(String[] args){
        // 1-1. 객체 생성
        AA aa = new AA();
        BB bb = new BB();
        AA ab = new BB();

        // 1-2. 인스턴스 필드
        System.out.println(aa.m);   // 1
        System.out.println(bb.m);   // 2
        System.out.println(ab.m);   // 1
        System.out.println();

        // 3. 스태틱을 썻으면 위처럼 안하고 바로 부를수 있자나 복습안하냐 -> 이게 정석이긴한데 위처럼 객체 생성해도 되긴해... 근데 위방법은 지양하는 방법이야
        System.out.println(AA.m);   // 1
        System.out.println(BB.m);   // 2
    }
}
