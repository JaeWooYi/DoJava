package sec25_Generic.g02_TheNeedForGeneric;

// #1. Apple, Pencil 클래스를 모두 저장하고 꺼낼수 있는 클래스

class Apple{}
class Pencil{}
class Goods{
    private Object object = new Object();
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
}

public class Solution1_UsingObject {
    public static void main(String[] args){
        // #2. Goods를 통해서 Apple 객체 추가 및 가져오기
        Goods goods1 = new Goods();
        goods1.setObject(new Apple());
        Apple apple = (Apple) goods1.getObject();

        // #3. Goods를 통해서 Pencil 객체 추가 및 가져오기
        Goods goods2 = new Goods();
        goods2.setObject(new Pencil());
        Pencil pencil = (Pencil) goods2.getObject();

        // ### 잘못한 캐스팅(약한 타입체크)
        Goods goods3 = new Goods();
        goods3.setObject(new Apple());
        Pencil pencil2 = (Pencil) goods3.getObject();   // 애플을 집어넣었자나 캐스팅이 잘못되었는데 오류로 인식을 못해    // 실행예외(Runtime)
    }
}
