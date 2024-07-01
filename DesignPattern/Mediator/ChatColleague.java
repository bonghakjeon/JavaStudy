// [자바 디자인 패턴 이해] 스터디
// 16강 중재자 패턴 (Mediator)
// 유튜브 참고 URL - 
// https://youtu.be/7imEWnkVFFg?si=bu6QFPCDqVx0jpPf

// 중재자 패턴 (Mediator)을 통해 간단한 관계로 구현한다.

package DesignPattern.Mediator;

import DesignPattern.Mediator.contract.Colleague;

public class ChatColleague extends Colleague {

    @Override
    public void handle(String data) {
        System.out.println(this + "-" + data);
    }
    
}
