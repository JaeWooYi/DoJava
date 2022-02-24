package sec12_InternalComponents.Ex02_Method;

public class m04_EffectOfPrimaryDataArgument {
    public static void main(String[] args) {
        int a = 3;
        int result1 = twice(3);
        System.out.println(a);
        System.out.println(result1);

        int result2 = twice(a);
        System.out.println(result2);
        System.out.println(a);      // 3이지 바보 멍청아. 밑에 메서드 a는 지역변수자나. 메모리 구조를 잘 생각해 봐. 그저 다른칸막이에 있는 a야.
    }

    public static int twice(int a){
        a *= 2;     // a = a * 2; 와 동일. 알지 재우야?
        return a;
    }
}
