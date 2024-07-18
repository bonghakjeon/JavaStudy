// [자바 디자인 패턴 이해] 스터디
// 18강 메멘토 패턴 (Memento Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/LA4__iGMXKA?si=r1uZMiVxwRCRizEx

package DesignPattern.Memento.Abst;

public class Memento {

    String state;

    protected Memento(String state) {
        this.state = state;

    }

    protected String getState() {
        return this.state;
    }
}
