package sec16_MethodOverriding.o03_SuperAndSuperMethod;

class AA {
    void abc(){
        System.out.println("AA class : abc()");
    }
}

class BB extends AA {
    @Override
    void abc(){
        System.out.println("BB class : abc()");
    }
    void bcd(){
        // 이제 앞에 super. 을 붙여봐
        super.abc();    // -> 부모의 abc()가 호출될거야
    }
}

public class s02_SuperKeyword_2 {
    public static void main(String[] args){
        BB bb = new BB();
        bb.bcd();
    }
}
