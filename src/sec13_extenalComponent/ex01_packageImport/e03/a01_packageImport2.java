package sec13_extenalComponent.ex01_packageImport.e03;

// 다른 패키지에 있는 클래스를 가져와 활용하기 2방법 : 임포트하기
import sec13_extenalComponent.ex01_packageImport.e01_common.ABC;

public class a01_packageImport2 {
    public static void main(String[] args){
        // 객체 생성할때 임포트 자동으로 해줘 히히
        ABC ExABC = new ABC();
        System.out.println(ExABC.m);
        System.out.println(ExABC.n);
        ExABC.print();
    }
}
