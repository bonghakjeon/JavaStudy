// [자바 디자인 패턴 이해] 스터디
// 16강 중재자 패턴 (Mediator)
// 유튜브 참고 URL - 
// https://youtu.be/7imEWnkVFFg?si=bu6QFPCDqVx0jpPf

// 중재자 패턴 (Mediator)을 통해 간단한 관계로 구현한다.

package DesignPattern.Mediator.contract;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    protected List<Colleague> colleagues;

    public Mediator() {
        colleagues = new ArrayList<Colleague>();
    }

    // 리스트 객체(colleagues)에 데이터(colleague) 추가
    public boolean addColleague(Colleague colleague) {
        if(colleagues != null)  
            return colleagues.add(colleague);
        else 
            return false;
    }

    // 중재 역할 
    // String data - 넘어온 데이터
    public abstract void mediate(String data);
}
