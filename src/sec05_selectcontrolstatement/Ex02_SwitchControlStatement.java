package sec05_selectcontrolstatement;

public class Ex02_SwitchControlStatement {
    public static void main(String[] args) {
        // no break , break -> if를 제외한 자기랑 가장 가까운 중괄호를 탈출하는 기능
        System.out.println("No break");
        int a = 2;
        switch (a){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");    // 점프후 계속 실행
            case 3:
                System.out.println("3");
            default:
                System.out.println("default");  // 그러므로 2부터 default까지 출력 된다.
        }
        System.out.println();

        // include break
        System.out.println("Include break");
        int a2 = 2;
        switch (a2){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");    // 실행 후 탈출
                break;                      // break가 있기 때문에 2까지만 출력!
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
        }
        System.out.println();

        // if - else if - else 구문으로 변환
        System.out.println("if - else if - else 구문으로 변환");
        if(a == 1){
            System.out.println("1");
        }else if(a == 2){
            System.out.println("2");    // 실행 후 탈출
        }else if(a == 3){
            System.out.println("3");
        }else{
            System.out.println("nope");
        }
    }
}
