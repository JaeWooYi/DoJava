package sec24_Thread.t01_TheNeedForThread;

public class TheNeedForThread {
    public static void main(String[] args) {
        // #1. 비디오프레임 1~5
        int[] videoFrame = new int[]{1,2,3,4,5};
        // #2. 자막번호 1~5
        String[] subtitleNum = new String[]{"하나","둘","셋","넷","다섯"};

        // #3. 비디오프레임 출력
        for (int i = 0; i < videoFrame.length; i++){
            System.out.print("(비디오프레임)" + videoFrame[i] + " ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }
        System.out.println();

        // #4. 자막번호 출력
        for(int i = 0; i < subtitleNum.length; i++){
            System.out.print("(자막번호)" + subtitleNum[i] + " ");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {

            }
        }
    }
}
