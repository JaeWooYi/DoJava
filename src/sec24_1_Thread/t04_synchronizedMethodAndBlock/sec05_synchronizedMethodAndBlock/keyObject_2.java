package sec24_1_Thread.t04_synchronizedMethodAndBlock.sec05_synchronizedMethodAndBlock;

class MyData{
    synchronized void abc(){
        for(int i = 0; i < 3; i++){
            System.out.println(i + "sec");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }

    synchronized void bcd(){
        for(int i = 0; i < 3; i++){
            System.out.println(i + "초");
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }

    void cde(){
        // ---------------------- 여기 synchronized (new Object()) -> 소괄호안에 this였어 원래는
        synchronized (new Object()) {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + "번째");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
    }
}

public class keyObject_2 {
    public static void main(String[] args){

        // #공유객체 생성
        MyData myData = new MyData();

        // #세개의 쓰레드가 각각의 메서드 호출
        new Thread(){
            public void run() {
                myData.abc();
            };
        }.start();

        new Thread(){
            public void run() {
                myData.bcd();
            };
        }.start();

        new Thread(){
            public void run() {
                myData.cde();
            };
        }.start();

    }
}
