// [자바 디자인 패턴 이해] 스터디
// 15강 옵저버 패턴 (Observer) - 2
// 유튜브 참고 URL - 
// https://youtu.be/6p0kD0LkaIs?si=ynw8-CSVm-pyMJrC

// 블로그 참고 URL - https://velog.io/@ljo_0920/%EC%98%B5%EC%A0%80%EB%B2%84-%ED%8C%A8%ED%84%B4-xzrb4hge

package DesignPattern.Observer2;

import DesignPattern.Observer2.Observable.Observer;

public class Application {
    public static void main(String[] args) {
        Button button = new Button();

        // addObserver - 옵저버 추가 
        button.addObserver(new Observer() {
            @override
            public void update(Observable o, Object arg) {
                System.out.println(o+"is Clicked");
            }
        });

        button.onClick();
        button.onClick();
        button.onClick();
    }
}

