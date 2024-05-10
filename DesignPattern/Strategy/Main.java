// [자바 디자인 패턴 이해] 
// 1강 스트래티지 패턴(Strategy Pattern)
// 유튜브 참고 URL - https://youtu.be/UEjsbd3IZvA?si=PW_N7iUeVvHTx7Z_

package DesignPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        // Ainterface ainterface = new AinterfaceImpl();

        // ainterface.funcA();   // 통로(접점)

        // AObj aObj = new AObj();
        // aObj.funcAA();

        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Axe());
        character.attack();
    }
}
