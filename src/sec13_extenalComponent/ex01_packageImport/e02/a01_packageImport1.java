package sec13_extenalComponent.ex01_packageImport.e02;

// 다른 패키지에 있는 클래스를 가져와 활용하기 1방법 : 클래스의 풀네임 사용

public class a01_packageImport1 {
    public static void main(String[] args){
//        ABC abc = new ABC();  // 외부패키지에있음 : 오류
        // 1. 객체 생성방법으로 풀네임
        sec13_extenalComponent.ex01_packageImport.e01_common.ABC ExABC = new sec13_extenalComponent.ex01_packageImport.e01_common.ABC();    // 풀네임으로 객체 만들기!

        // 2. 멤버활용
        System.out.println(ExABC.m);
        System.out.println(ExABC.n);
        ExABC.print();
    }
}
