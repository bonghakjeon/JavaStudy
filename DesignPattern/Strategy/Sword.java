// [자바 디자인 패턴 이해] 
// 1강 스트래티지 패턴(Strategy Pattern)
// 유튜브 참고 URL - https://youtu.be/UEjsbd3IZvA?si=PW_N7iUeVvHTx7Z_

package DesignPattern.Strategy;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("검 공격");
    }
}
