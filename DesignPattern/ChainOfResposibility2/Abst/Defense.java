// [자바 디자인 패턴 이해] 스터디
// 13강 책임사슬 패턴 (Chain of Resposibility) - 2
// 유튜브 참고 URL - 
// https://youtu.be/5d7MqGp1Jwg?si=sxeHhpILPNoYS_Mh

package DesignPattern.ChainOfResposibility2.Abst;

import DesignPattern.ChainOfResposibility2.Concrete.Attack;

public interface Defense {
    public void defense(Attack attack);
}
