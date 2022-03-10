package sec24_Thread.t05_ThreadState_01;

public class NewRunnableTerminated {
    public static void main(String[] args){
        // #쓰레드 상태 저장 클래스
        Thread.State state;

        // #1. 객체생성(NEW)
        Thread thread = new Thread(){
            @Override
            public void run() {
                for(long i = 0 ; i < 100000000; i++){} // 시간지연만 하려고 만든 포문 : 런에 아무것도 안넣으면 너무 빠르기때문에 터미네이트되서 꺼질까봐
            }
        };

        state = thread.getState();
        System.out.println("thread state = " + state);  // NEW 객체로 생성한 결과
//        System.out.println("thread state = " + thread.getState());  //state = thread.getState(); 이거 지우고 이렇게 넣어도 결과값으 똑같아

        // #2. Thread 시작
        thread.start();
        state = thread.getState();
        System.out.println("thread state = " + state);  // Runnable상태가 나온다

        // #3. Thread 종료
        try {
            thread.join();      // join을 걸어준 이유 : thread.join(); -> 여기서 thread한테 모든 CPU를 할당하라 라는뜻 : 주석 걸고 출력해봐 Runnable 뜨지
        } catch (InterruptedException e) {}

        state = thread.getState();
        System.out.println("thread state = " + state);  // Runnable이 끝나면 Terminated가 나온다
    }
}
