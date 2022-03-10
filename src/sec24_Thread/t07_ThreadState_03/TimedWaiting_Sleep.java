package sec24_Thread.t07_ThreadState_03;

class MyThread extends Thread {
    @Override
    public void run() {
        try {Thread.sleep(3000);} catch (InterruptedException e) {
            System.out.println(" -- sleep() 진행중 interrupt() 발생");   // interrupt() 깨우는거라고 받아드려. sleep는 자는거자나
            for(long i = 0; i < 1000000000L; i++){}
        }
    }
}

public class TimedWaiting_Sleep {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();

        try {Thread.sleep(100);} catch (InterruptedException e) {}  // 쓰레드 시작 준비 시간 -> 이거 없으면 RUNNABLE 떠
        System.out.println("MyThread State = " + myThread.getState());  // TIMED_WAITING

        myThread.interrupt();   // 위가 TIMED_WAITING 인데 깨우겠다는뜻
        try {Thread.sleep(100);} catch (InterruptedException e) {}  // 쓰레드 시작 준비 시간
        System.out.println("MyThread State = " + myThread.getState());

    }
}
