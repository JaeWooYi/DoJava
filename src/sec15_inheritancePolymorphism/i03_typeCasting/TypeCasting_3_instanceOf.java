package sec15_inheritancePolymorphism.i03_typeCasting;

class ZXC01{}

class ZXC02 extends ZXC01{}

public class TypeCasting_3_instanceOf {
    public static void main(String[] args){
        // 1. instanceOf : 캐스팅이 가능한지 체트하는거야 메모리 구조가 이해가 안된다면 걍 이거로 확인하는데 제발 이해좀 하고 써라
        ZXC01 zzz1 = new ZXC01();
        ZXC01 zzz2 = new ZXC02();

        System.out.println(zzz1 instanceof ZXC01);
        System.out.println(zzz2 instanceof ZXC01);

        System.out.println(zzz1 instanceof ZXC02);
        System.out.println(zzz2 instanceof ZXC02);

        System.out.println();
        System.out.println();

        // 2. 이런식으로 써도되.. 힘내 캐스팅 너무싫어. CS지식이 너무없어서 그래 내가
        if(zzz1 instanceof ZXC02){
            ZXC02 Ex01 = (ZXC02)zzz1;
            System.out.println("zzz1을 ZXC02로 캐스팅 하였습니다.");
        }else{
            System.out.println("zzz1는 ZXC02타입으로 캐스팅이 불가.");
        }

        System.out.println();
        System.out.println();

        if(zzz2 instanceof ZXC02){
            ZXC02 Ex02 = (ZXC02)zzz2;
            System.out.println("zzz2을 ZXC02로 캐스팅 하였습니다.");
        }else{
            System.out.println("zzz2는 ZXC02타입으로 캐스팅이 불가.");
        }

        System.out.println();
        System.out.println();

        // 예
        if("안녕" instanceof String){
            System.out.println("\"안녕\"은 String 클래스 입니다.");
        }
    }
}
