package sec12_InternalComponents.Ex02_Method;

public class m06_MethodOverloading {
    public static void main(String[] args) {
        print();
        print(3);
        print(3,0.8);
    }

    public static void print(){
        System.out.println("no data");
    }

    public static void print(int a){
        System.out.println(a);
    }

    public static void print(int a, double b){
        System.out.println(a + b);
    }
}
