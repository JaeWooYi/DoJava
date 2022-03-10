package sec24_Thread.t02_CreateAndStartThread.t02_CreateAndStartThread_M1C2;

// #1. 방법2(M1). Thread 클래스 상속하여 클래스 생성
// --------- case2 : 3개의 Thread 생성 (main까지)

class SMIFileThread extends Thread{
    @Override
    public void run() {
        // 2. 자막번호 : 하나 ~ 다섯
        String[] strArray = new String[]{"하나", "둘", "셋", "넷", "다섯"};

        // 자막은 비디오보다 조금 늦게 나오게 하려고 넣었어
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }

        // 2-2. 자막 번호 출력
        for(int i = 0; i < strArray.length; i++){
            System.out.println(" - (자막번호) " + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }
    }
}

class VideoFileThread extends Thread {
    @Override
    public void run() {
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

public class CreateAndStartThread_M1C2 {
    public static void main(String[] args){
        // SMIFileThread 객체생성 및 시작
        // Thread smiFileThread = new SMIFileThread();로 해도 된다
        SMIFileThread smiFileThread = new SMIFileThread();
        smiFileThread.start();

        // VideoFileThread 객체생성 및 시작
        VideoFileThread videoFileThread = new VideoFileThread();
        videoFileThread.start();
    }
}
