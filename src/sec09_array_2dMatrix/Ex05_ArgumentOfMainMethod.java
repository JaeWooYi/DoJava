package sec09_array_2dMatrix;

public class Ex05_ArgumentOfMainMethod {
    public static void main(String[] args) {
        // 1. args 배열의 길이 구하기
        System.out.println("1. args 배열의 길이 구하기");
        System.out.println(args.length);
        System.out.println();

        // 데이터 출력
        System.out.println("2. args 데이터 출력");
        // 출력값 보면 알겠지만 얘내 다 String 이야
        System.out.println(args[0] + 1);
        System.out.println(args[1] + 1);
        System.out.println(args[2] + 1);
        System.out.println();
        // 변환을 해보자
        System.out.println("변환을 해보자");
        System.out.println(Integer.parseInt(args[1]) + 1);
        System.out.println(Double.parseDouble(args[2]) + 1);
        System.out.println();

        // 3. args 매개변수 출력(for)
        System.out.println("3. args 매개변수 출력(for)");
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
        System.out.println();

        // 4. args 매개변수 출력(for-each)
        System.out.println("4. args 매개변수 출력(for-each)");
        for(String s : args){
            System.out.println(s);
        }
    }
}
