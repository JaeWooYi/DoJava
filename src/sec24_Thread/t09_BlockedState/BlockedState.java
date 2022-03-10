package sec24_Thread.t09_BlockedState;

class MyBlockTest{

    // #1. 이번엔 이너클래스로 해볼까?
    class MyClass {
        synchronized void syncMethod(){
            try {Thread.sleep(100);} catch (InterruptedException e) {}  //쓰레드 시작 준비 시간
            System.out.println("====" + Thread.currentThread().getName());
            System.out.println("thread1 -> " + t1.getState());
            System.out.println("thread2 -> " + t2.getState());
            System.out.println("thread3 -> " + t3.getState());

            for(long i=0; i < 1000000000L; i++){}   // 시간지연
        }
    }

    // #2. 공유객체
    MyClass mc = new MyClass();

    // #3. 세 개의 쓰레드 필드 생성
    Thread t1 = new Thread("thread1"){
        @Override
        public void run() {
            mc.syncMethod();
        }
    };
    Thread t2 = new Thread("thread2"){
        @Override
        public void run() {
            mc.syncMethod();
        }
    };
    Thread t3 = new Thread("thread3"){
        @Override
        public void run() {
            mc.syncMethod();
        }
    };

    void startAll(){
        t1.start();
        t2.start();
        t3.start();
    }
}

public class BlockedState {
    public static void main(String[] args){
        MyBlockTest myBlockTest = new MyBlockTest();
        myBlockTest.startAll();
    }
}
