package sec24_Thread.t02_CreateAndStartThread.t05_CreateAndStartThread_M2C3;

// 익명이너클래스로 쓰는법! 이방법 많이쓰인데 중요해 재우야

public class CreateAndStartThread_M2C3 {
    public static void main(String[] args){
        // 1. 쓰레드 객체 생성 : 자막번호
        Thread thread1 = new Thread(new Runnable() {
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
        });

        // 2. 쓰레드 객체 생성 : 비디오 번호
        Thread thread2 = new Thread(new Runnable() {
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
        });

        // 쓰래드 실행
        thread1.start();
        thread2.start();
    }
}
