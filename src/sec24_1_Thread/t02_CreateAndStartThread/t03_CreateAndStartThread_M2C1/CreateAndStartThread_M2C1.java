package sec24_1_Thread.t02_CreateAndStartThread.t03_CreateAndStartThread_M2C1;

// #1. 방법1(M2). Runnable 인터페이스 상속하여 클래스 생성 case1 : 2개의 쓰레드 생성

class SMIFileRunnable implements Runnable{
    @Override
    public void run() {
        String[] strArray = new String[]{"하나", "둘", "셋", "넷", "다섯"};

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}

        for(int i = 0; i < strArray.length; i++){
            System.out.println(" - (자막번호) " + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {}
        }
    }
}

public class CreateAndStartThread_M2C1 {
    public static void main(String[] args){
        // SMIFileRunnable 객체 생성
//        Runnable smiFileRunnable = new SMIFileRunnable(); 로 해도 된다
        SMIFileRunnable smiFileRunnable = new SMIFileRunnable();
//        smiFileRunnable.start();  // 오류
        //오류가 안나려면? 쓰레드안에 생성자를 통해 넘겨줘야한다
        Thread thread = new Thread(smiFileRunnable);
        thread.start();

        // 1. 비디오 프레임 1~5
        int[] intArray = new int[]{1, 2, 3, 4, 5};

        // 1-1. 비디오 프레임 출력
        for(int i = 0; i < intArray.length; i++){
            System.out.print("(비디오프레임) " + intArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }
    }
}
