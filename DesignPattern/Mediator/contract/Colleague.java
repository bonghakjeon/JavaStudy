// [자바 디자인 패턴 이해] 스터디
// 16강 중재자 패턴 (Mediator)
// 유튜브 참고 URL - 
// https://youtu.be/7imEWnkVFFg?si=bu6QFPCDqVx0jpPf

// 중재자 패턴 (Mediator)을 통해 간단한 관계로 구현한다.

package DesignPattern.Mediator.contract;

public abstract class Colleague {

    // 어떠한 중재자(Mediator)에 자신이 속해있는지 확인 
    private Mediator mediator;

    public boolean join(Mediator mediator) {
        if(mediator == null) return false;

        this.mediator = mediator;
        return mediator.addColleague(this);
    }

    public void sendData(String data) {
        if(mediator != null) 
            mediator.mediate(data);
    }

    abstract public void handle(String data);
}
