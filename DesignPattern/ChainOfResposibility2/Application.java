// [자바 디자인 패턴 이해] 스터디
// 13강 책임사슬 패턴 (Chain of Resposibility) - 2
// 유튜브 참고 URL - 
// https://youtu.be/5d7MqGp1Jwg?si=sxeHhpILPNoYS_Mh

package DesignPattern.ChainOfResposibility2;

import DesignPattern.ChainOfResposibility2.Abst.Defense;
import DesignPattern.ChainOfResposibility2.Concrete.Armor;
import DesignPattern.ChainOfResposibility2.Concrete.Attack;

public class Application {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Attack attack = new Attack(100);

        Armor armor1 = new Armor(10);
        Armor armor2 = new Armor(15);

        // 아머 2개(armor1. armor2)를 입고 있음.
        armor1.setNextDefense(armor2);
        
        // 첫 번째 공격 
        armor1.defense(attack);

        // 100 - 10 - 15 = 75 
        System.out.println(attack.getAmount()); 

        // 두 번째 중요한 포인트 
        // 게임하는 중간에도 또 다른 방어구(defense)를
        // 추가 착용할 수 있도록 동적으로 책임을 추가할 수 있도록 구현 가능.
        // 또 다른 방어구(defense) 하나를 가지고 있음.
        Defense defense = new Defense() {

            @Override
            public void defense(Attack attack) {
                int amount = attack.getAmount();
                attack.setAmount(amount -= 50);
            }
        };

        // 게임 도중에 또 다른 방어구(defense) 추가 착용함.
        armor2.setNextDefense(defense);

        attack.setAmount(100);

        // 두 번째 공격 
        armor1.defense(attack);

        // 75 - 50 = 25
        System.out.println(attack.getAmount());
    }
}
