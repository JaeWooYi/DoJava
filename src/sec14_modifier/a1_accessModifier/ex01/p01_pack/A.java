package sec14_modifier.a1_accessModifier.ex01.p01_pack;

public class A {

    // 여기 4개의 필드가 있지
    public int a = 1;
    protected int b = 2;
    int c = 3;  // default접근지정자가 있는거야 앞에.
    private int d = 4;

    public void print(){
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(d);
    }

//    public static void main(String[] args){
//        A a = new A();
//        a.print();
//    }
}
