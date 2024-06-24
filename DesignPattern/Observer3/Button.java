// [자바 디자인 패턴 이해] 스터디
// 15강 옵저버 패턴 (Observer) - 3
// 유튜브 참고 URL - 
// https://youtu.be/eHzDfDcpCu8?si=_wlTh-fnzFkyVwbD

package DesignPattern.Observer3;

import DesignPattern.Observer3.Observable.Observer;

public class Button {
    public Button() {
        observable = new Observable<String>();
    }

    private Observable<String> observable;  // 델리게이트 객체 

    public void addObserver(Observer<String> o) { 
        observable.addObserver(o);
    }

    public void notifyObservers() {
        observable.notifyObservers(null);
    }

    public void onClick() {
        observable.setChanged();
        notifyObservers();
    }
}
