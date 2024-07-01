// [자바 디자인 패턴 이해] 스터디
// 16강 중재자 패턴 (Mediator)
// 유튜브 참고 URL - 
// https://youtu.be/7imEWnkVFFg?si=bu6QFPCDqVx0jpPf

// 중재자 패턴 (Mediator)을 통해 간단한 관계로 구현한다.

package DesignPattern.Mediator;

import DesignPattern.Mediator.contract.Colleague;
import DesignPattern.Mediator.contract.Mediator;

public class Application {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        // 1. 중재자 객체 mediator 생성
        Mediator mediator = new ChatMediator();

        // 2. 동료 객체 colleague1, colleague2, colleague3 생성
        Colleague colleague1 = new ChatColleague();
        Colleague colleague2 = new ChatColleague();
        Colleague colleague3 = new ChatColleague();

        // 3. 동료 객체(colleague1, colleague2, colleague3)들이 중재자 객체(mediator)에 join 처리 
        colleague1.join(mediator);
        colleague2.join(mediator);
        colleague3.join(mediator);

        // 4. 동료 객체(colleague1, colleague2, colleague3)들이 중재자 객체 mediator에게 데이터 전송(sendData)
        // 중재자 객체 mediator가 ChatMediator 클래스 메서드 mediate 호출해서 넘어온 데이터를 받고 
        // ChatColleague 클래스 메서드 handle 호출해서 
        // 동료 객체(colleague1, colleague2, colleague3)들 끼리 데이터를 주고 받을 수 있는 형태로 처리됨.
        colleague1.sendData("AAA");
        colleague2.sendData("BBB");
        colleague3.sendData("CCC");


    }
}
