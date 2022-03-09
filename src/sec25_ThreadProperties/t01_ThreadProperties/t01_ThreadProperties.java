package sec25_ThreadProperties.t01_ThreadProperties;

// 쓰레드 객체 가져오기 / 이름설정 / 쓰레드 수

public class t01_ThreadProperties {
    public static void main(String[] args){
        // #1. 객체 가져오기(currentThread() -> 정적메서드 : 객체 만들지않고 클래스이름으로 바로 쓸수있음) / 쓰레드 수(activeCount())
        Thread curThread = Thread.currentThread();
        System.out.println("현재 쓰레드의 이름 = " + curThread.getName()); // getName() : 인스턴스 메서드
        System.out.println("현재 동작하는 쓰레드 수 = " + Thread.activeCount());

        System.out.println();

        // #2. 쓰레드 이름 지정(자동지정 : 내가 지정하지않으면 자동으로 됨)
        for(int i = 0; i < 3; i++){
            Thread thread = new Thread();
            System.out.println(thread.getName());
            thread.start();
        }

        System.out.println();

        // #3. 쓰레드 이름 직접 지정
        for(int i = 0; i < 3; i++){
            Thread thread = new Thread();
            thread.setName(i + "번째 스레드");
            System.out.println(thread.getName());
            thread.start();
        }

        System.out.println();

        // #4. 쓰레드이름 다시 자동 지정
        for(int i = 0; i < 3; i++){
            Thread thread = new Thread();
            System.out.println(thread.getName());
            thread.start();
        }

        System.out.println();

        // #5. 쓰레드 수
        System.out.println("동작하는 쓰레드 수" + Thread.activeCount());
    }
}
