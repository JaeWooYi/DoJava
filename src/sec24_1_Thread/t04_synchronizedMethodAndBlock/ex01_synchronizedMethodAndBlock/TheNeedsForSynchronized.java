package sec24_1_Thread.t04_synchronizedMethodAndBlock.ex01_synchronizedMethodAndBlock;

// #공유객체
class MyData{
    int data = 3;
    public void plusData(){
        int mydata = data;  // 데이터를 가져오기
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        data = mydata + 1;
    }
}

// #공유객체를 사용하는 쓰레드
class PlusThread extends Thread{

    // 공유 객체 필드 만들기
    MyData myData;

    public PlusThread(MyData myData){
        this.myData = myData;
    }

    @Override
    public void run() {
        myData.plusData();
        System.out.println(getName() + "실행결과 : " + myData.data);
    }
}

public class TheNeedsForSynchronized {
    public static void main(String[] args){

        // # 공유객체 생성
        MyData myData = new MyData();

        // #1. plusThread 1
        Thread plusThread1 = new PlusThread(myData);
        plusThread1.setName("plusThread1");
        plusThread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // #2. plusThread 2
        Thread plusThread2 = new PlusThread(myData);
        plusThread2.setName("plusThread2");
        plusThread2.start();
    }
}
