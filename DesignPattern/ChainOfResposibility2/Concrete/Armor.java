// [자바 디자인 패턴 이해] 스터디
// 13강 책임사슬 패턴 (Chain of Resposibility) - 2
// 유튜브 참고 URL - 
// https://youtu.be/5d7MqGp1Jwg?si=sxeHhpILPNoYS_Mh

package DesignPattern.ChainOfResposibility2.Concrete;

import DesignPattern.ChainOfResposibility2.Abst.Defense;

public class Armor implements Defense {

    private Defense nextDefense;

    private int def;   // 방어력

    public Armor() {

    }

    public Armor(int def) {
        this.def = def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public void defense(Attack attack) {
        // 중요 포인트!
        // 책임 사슬 패턴은 하나의 객체만 그 책임을 지지 않아도 된다.
        // 여러가지 객체가 다 같이 책임 져도 된다.
        process(attack);
        if (nextDefense!=null) {
            nextDefense.defense(attack);
        }
    }

    private void process(Attack attack) {
        int amount = attack.getAmount();
        amount -= def;   // 내구도 감소 
        attack.setAmount(amount);
    }

    public void setNextDefense(Defense nextDefense) {
        this.nextDefense = nextDefense;
    }
}
