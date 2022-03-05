package sec22_InnerInterface.i02_ButtonApiExample;

class Button {
    OnClickListener onClickListener;

    void setOnClickListener (OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    interface OnClickListener {
        public abstract void onClick();
    }

    void onClick(){
        onClickListener.onClick();
    }
}

public class i01_ButtonApiExample {
    public static void main(String[] args) {
        // #1 . 개발자1. 클릭했을때 음악을 재생하는상황 가정
        Button btn1 = new Button();
        btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("개발자1. 음악재생");
            }
        });
        btn1.onClick();     // 개발자1. 음악재생

        System.out.println();

        // #2 . 개발자1. 클릭했을때 네이버 접속
        Button btn2 = new Button();
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("개발자2. 네이버접속");
            }
        });
        btn2.onClick();
    }
}
















