// [자바 디자인 패턴 이해] 
// 1강 스트래티지 패턴(Strategy Pattern)
// 유튜브 참고 URL - https://youtu.be/UEjsbd3IZvA?si=PW_N7iUeVvHTx7Z_

package DesignPattern.Strategy;

public class GameCharacter {
    // 추상적인 접근점 (무기 - 검 or 칼 둘다 가능)
    private Weapon weapon;

    // 무기 교환 가능 
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // 공격
    public void attack() {
        if(weapon == null) {
            System.out.println("맨손 공격");
        } else {
            weapon.attack();  // 델리게이트(weapon 에게 어떤 공격을 할지 위임하다.)
        }
    }
}
