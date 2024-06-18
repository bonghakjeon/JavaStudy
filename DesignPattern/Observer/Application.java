// [자바 디자인 패턴 이해] 스터디
// 15강 옵저버 패턴 (Observer) - 1
// 유튜브 참고 URL - 
// https://youtu.be/4w4AV1HURJs?si=_fO_KoOqfJts71iF

package DesignPattern.Observer;

import DesignPattern.Observer.Button.OnClickListner;

public class Application {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        Button button = new Button();

        
        // button.setOnClickListner(new ButtonClick());
        // 아래처럼 익명 클래스 형태로 구현 가능 
        button.setOnClickListner(new OnClickListner() {
            @Override
            public void onClick(Button button) {
                System.out.println(button+" is Clicked");
            }
        });

        // Button 클래스 객체 외부에서 onClick 이벤트 처리 
        button.onClick(); // 버튼을 누가 클릭함.
    }
}

class ButtonClick implements OnClickListner {

    @Override
    public void onClick(Button button) {
        System.out.println(button + "is Clicked");
    }
    
}
