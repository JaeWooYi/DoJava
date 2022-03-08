package sec24_2_CreateAndStartThread.t04_CreateAndStartThread_M2C2;

class SMIFileRunnable implements Runnable{
    @Override
    public void run() {
        String[] strArray = new String[]{"하나", "둘", "셋", "넷", "다섯"};
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        for(int i = 0; i < strArray.length; i++){
            System.out.println(" - (자막번호) " + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }
    }
}

class VideoFileThread implements Runnable {
    @Override
    public void run() {
        int[] intArray = new int[]{1, 2, 3, 4, 5};

        for(int i = 0; i < intArray.length; i++){
            System.out.print("(비디오프레임) " + intArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class CreateAndStartThread_M2C2 {
    public static void main(String[] args) {
        SMIFileRunnable smiFileRunnable = new SMIFileRunnable();
        Thread thread1 = new Thread(smiFileRunnable);
        thread1.start();

        VideoFileThread videoFileThread = new VideoFileThread();
        Thread thread2 = new Thread(videoFileThread);
        thread2.start();
    }
}
