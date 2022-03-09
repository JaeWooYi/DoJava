package sec25_ThreadProperties.t03_DaemonThread;

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName() + " : " + (isDaemon()? "데몬쓰레드" : "일반쓰레드"));    // 삼항연산자 잊지마
        for(int i = 0; i < 6; i++){
            System.out.println(getName() + " : " + i + "초");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

public class ThreadProperties_2_1 {
    public static void main(String[] args){

        // #1, #2 각각 번갈아가면서 주석처리하고 비교해봐 값이 어떻게 다른지

//        // #1. 일반쓰레드
//        Thread thread1 = new MyThread();
//        thread1.setDaemon(false);   // false가 디폴트라서 생략해도 false들어가있어
//        thread1.setName("thread1");
//        thread1.start();

        // #2. 데몬쓰레드
        Thread thread2 = new MyThread();
        thread2.setDaemon(true);
        thread2.setName("thread2");
        thread2.start();

        // #3. 3초후 메인쓰레드 종료
        try {
            Thread.sleep(3100);
        } catch (InterruptedException e) {}
        System.out.println("main Thread 종료");
    }
}
