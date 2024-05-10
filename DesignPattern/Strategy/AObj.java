// [자바 디자인 패턴 이해] 
// 1강 스트래티지 패턴(Strategy Pattern)
// 유튜브 참고 URL - https://youtu.be/UEjsbd3IZvA?si=PW_N7iUeVvHTx7Z_

package DesignPattern.Strategy;

public class AObj {

    Ainterface ainterface;

    public AObj() {
        ainterface = new AinterfaceImpl();
    }

    public void funcAA() {
        // 위임한다.
        ainterface.funcA();
        ainterface.funcA();

        // System.out.println("AAA");
        // System.out.println("AAA");

        // ~ 기능이 필요합니다. 개발해주세요.
    }
}
