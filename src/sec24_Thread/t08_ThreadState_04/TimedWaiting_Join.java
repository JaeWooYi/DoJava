package sec24_Thread.t08_ThreadState_04;

class MyThread1 extends Thread{
    @Override
    public void run() {
        for(long i = 0; i < 1000000000L; i++){} // 시간지연
    }
}

class MyThread2 extends Thread{
    MyThread1 myThread1;
    public MyThread2(MyThread1 myThread1){
        this.myThread1 = myThread1;
    }

    @Override
    public void run() {
        try {
            myThread1.join(3000);   // 최대 3초를 기다리겠다 -> MyThread1한테 CPU 할당해라
        } catch (InterruptedException e) {
            System.out.println(" -- join() 진행중 interrupt() 발생");
            for(long i = 0; i < 100000000L; i++){} // 시간지연
        }
    }
}

public class TimedWaiting_Join {
    public static void main(String[] args){

        // #1. 객체 생성
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2(myThread1);
        myThread1.start();
        myThread2.start();

        try {Thread.sleep(100);} catch (InterruptedException e) {}  // 쓰레드 시작 준비 시간
        System.out.println("MyThread State = " + myThread1.getState());  // RUNNABLE
        System.out.println("MyThread State = " + myThread2.getState());  // TIMED_WAITING

        myThread2.interrupt();  // TIMED_WAITING 상태만 interrupt() 걸 수 있다.
        System.out.println("MyThread State = " + myThread1.getState());  // RUNNABLE
        System.out.println("MyThread State = " + myThread2.getState());  //
    }
}
