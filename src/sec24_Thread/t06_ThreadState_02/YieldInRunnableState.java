package sec24_Thread.t06_ThreadState_02;

class MyThread extends Thread{
    boolean yieldFlag;

    @Override
    public void run() {
        while(true){
            if(yieldFlag){
                Thread.yield();     // yieldFlag가 true인 경우에는 양보하겠다 -> CPU안쓰겠다
            }else{
                System.out.println(getName() + " 실행");
                for(long i = 0; i < 100000000; i++){}   // 시간지연
            }
        }
    }
}

public class YieldInRunnableState {
    public static void main(String[] args){

        MyThread myThread1 = new MyThread();
        myThread1.setName("thread1");
        myThread1.yieldFlag = false;
        myThread1.setDaemon(true);
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.setName("thread2");
        myThread2.yieldFlag = true; // 계속 양보한다
        myThread2.setDaemon(true);
        myThread2.start();

        // #1. 6초 지연(1초마다 한번씩 양보)
        for (int i = 0; i < 6; i++) {
            try {Thread.sleep(1000);} catch (InterruptedException e) {}
            myThread1.yieldFlag =! myThread1.yieldFlag; // 반전시킨다는뜻
            myThread2.yieldFlag =! myThread2.yieldFlag; // 반전시킨다는뜻  : 1초마다 한번씩 서로 반전
        }

    }
}
