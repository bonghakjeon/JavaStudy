// [자바 디자인 패턴 이해] 스터디
// 18강 메멘토 패턴 (Memento Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/LA4__iGMXKA?si=r1uZMiVxwRCRizEx

package DesignPattern.Memento.Abst;

public class Originator {

    String state;  // 상태를 저장하는 문자 (저장 해야할 객체의 중요한 데이터)

    // Memento를 생성 해준 다음에 CareTaker에게 넘겨주는 방식으로 구현 
    public Memento createMemento() {
        return new Memento(state);
    }

    // 원래 상태로 복구 
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
