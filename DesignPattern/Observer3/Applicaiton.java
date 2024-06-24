// [자바 디자인 패턴 이해] 스터디
// 15강 옵저버 패턴 (Observer) - 3
// 유튜브 참고 URL - 
// https://youtu.be/eHzDfDcpCu8?si=_wlTh-fnzFkyVwbD

package DesignPattern.Observer3;

import DesignPattern.Observer3.Observable.Observer;

public class Applicaiton {
    public static void main(String[] args) {
        // 1. 제네릭
        // 2. 델리게이트 (Button 클래스 -> 델리게이트 객체 observable)
        // 3. Observable<T> 클래스 내부에 Observer<T> 인터페이스를 넣는다. (Observable<T> 클래스와 Observer<T> 인터페이스를 서로 관계되어 있다.)

        Button button = new Button();
        button.addObserver(new Observer<String>() {

            @Override
            public void update(Observable<String> o, String arg) {
                System.out.println(o + "is clicked");
            }
            
        });

        button.onClick();
        button.onClick();
        button.onClick();
    }
}
