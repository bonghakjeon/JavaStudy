// [자바 디자인 패턴 이해] 스터디
// 16강 중재자 패턴 (Mediator)
// 유튜브 참고 URL - 
// https://youtu.be/7imEWnkVFFg?si=bu6QFPCDqVx0jpPf

// 중재자 패턴 (Mediator)을 통해 간단한 관계로 구현한다.

package DesignPattern.Mediator;

import DesignPattern.Mediator.contract.Colleague;
import DesignPattern.Mediator.contract.Mediator;

public class ChatMediator extends Mediator {

    @Override
    public void mediate(String data) {
        for(Colleague colleague : colleagues) {
            // 중재 가능성 있는 정보가 있으면 메서드 handle 호출해서 걸러내기 
            // (걸러내는 방식은 누구한테 보낼지 않 보낼지, 혹은 두번 보낼지, 혹은 시간에 따라 다르게 보낼지, 모든 사람에게 데이터를 돌려보내는 등등...)
            // (예) 귓말, A -> B로 메시지 보내기 
            colleague.handle(data);
        }
    }
    
}
