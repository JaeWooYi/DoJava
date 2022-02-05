package sec05_selectcontrolstatement;

public class Ex01_IfControlStatement {
    public static void main(String[] args) {
        // 1. if
        System.out.println(" 1. if ");
        int a = 5;
        if (a > 3) {
            System.out.println("옳은 a");
        }
        if (a < 5) {
            System.out.println("옳지 않은 a");
        }

        boolean b1 = true;
        boolean b2 = false;
        if (b1) {
            System.out.println("실행 b1 : boolean true");
        }
        if (b2) {
            System.out.println("실행 b2 : boolean false");
        }

        // 2. if-else
        System.out.println();
        System.out.println(" 2. if-else");
        int c = 5;
        if (c > 3) {
            System.out.println("실행 good");
        } else {
            System.out.println("실행 bad");
        }
        System.out.println();
        // cf. 삼항 연산자와 변환 가능
        System.out.println("cf. 삼항 연산자와 변환 가능");
        System.out.println((c > 3) ? "실행 good" : "실행 bad");
        System.out.println();

        // 3. if-else if-else if- ... -else
        System.out.println("if-else if-else if- ... -else");
        int d = 85;
        if(d >= 90){
            System.out.println("A grade");
        }else if(d >= 80){
            System.out.println("B grade");  // 실행 후 탈출
        }else if(d >= 70){
            System.out.println("C grade");
        }else{
            System.out.println("you failed");
        }
        if(d >= 70){
            System.out.println("C grade");  // 실행 후 탈출
        }else if(d >= 80){
            System.out.println("B grade");
        }else if(d >= 90){
            System.out.println("C grade");
        }else{
            System.out.println("you failed");
        }

        if(d >= 70 && d < 80){
            System.out.println("C grade");
        }else if(d >= 80 && d < 90){
            System.out.println("B grade");  // 실행 후 탈출
        }else if(d >= 90){
            System.out.println("A grade");
        }else{
            System.out.println("you failed");
        }
    }
}
