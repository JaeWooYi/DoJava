package sec25_ThreadProperties.t02_ThreadProperties;

// 우선순위

class MyThread extends Thread{
    @Override
    public void run() {
        for(long i = 0; i < 100000000; i ++){}  // 시간 지연용
        System.out.println(getName() + "우선순위 : " + getPriority());
    }
}

public class t02_ThreadProperties {
    public static void main(String[] args){
        // 참고 : CPU core 보기
        System.out.println("코어수 = " + Runtime.getRuntime().availableProcessors());

        System.out.println();

        // #1. 디폴트 우선순위 -> 외부 클래스 class MyThread 만들고
        for(int i = 0 ; i < 3; i++){
            Thread thread = new MyThread();
            thread.start();
        }

        // #2. 우선순위를 직접 지정
        for(int i = 0; i < 10; i++){
            Thread thread = new MyThread();
            thread.setName(i + "번째 쓰레드");
            if(i == 9) thread.setPriority(10);
            thread.start();
        }
    }
}
