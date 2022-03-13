package sec25_Generic.g06_GenericMethod;

// 일반클래스 안에 제네릭 메서드
class GenericMethods {
    public <T> T method1(T t){
        return t;
    }
    public <T> boolean method2(T t1, T t2){
        return t1.equals(t2);       // equals -> 스택메모리의 값이 같은지 틀린지 비교하는것
    }
    public <K, V> void method3(K k, V v){
        System.out.println(k + " : " + v);
    }
}

public class GenericMethod {
    public static void main(String[] args){

        GenericMethods genericMethods = new GenericMethods();
        String str1 = genericMethods.<String>method1("HI1");     // <String>이 생략이 가능해. 왜냐면 유추가 가능하자나
        String str2 = genericMethods.method1("HI2");     // 봐봐 오류 없자나
        System.out.println(str1);
        System.out.println(str2);

        System.out.println();

        boolean bool1 = genericMethods.<Double>method2(2.5,3.5);
        boolean bool2 = genericMethods.method2(2.5,2.5);
        System.out.println(bool1);
        System.out.println(bool2);

        System.out.println();

        genericMethods.<String, Integer>method3("국어", 80);
        genericMethods.<Integer, String>method3(1, "국어");
        genericMethods.method3("HI","Bye");

    }
}
