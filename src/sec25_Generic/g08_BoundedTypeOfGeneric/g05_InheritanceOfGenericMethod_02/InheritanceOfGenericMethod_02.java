package sec25_Generic.g08_BoundedTypeOfGeneric.g05_InheritanceOfGenericMethod_02;

class Parent {
    <T extends Number> void ParentMethod(T t){
        System.out.println(t);
    }
}

class Child extends Parent {}

public class InheritanceOfGenericMethod_02 {
    public static void main(String[] args) {

        // #1. 부모클래스 제네릭메서드 이용
        Parent parent = new Parent();
        parent.ParentMethod(100);
        parent.<Integer>ParentMethod(100);  // <Integer> 생략해도 뭐 어차피 아무거나 다 와, 아래 자식클래스봐봐 double인데 아무거도 안써도 받자나. 전부다 Number 아래에 있어.

        System.out.println();

        // #2. 자식클래스 제네릭메서드 이용
        Child child = new Child();
        child.ParentMethod(9.9);
    }
}
