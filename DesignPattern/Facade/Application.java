// [자바 디자인 패턴 이해] 스터디
// 14강 퍼사드 패턴 (Facade)
// 유튜브 참고 URL - 
// https://youtu.be/BqDimaIoStQ?si=wTIG_9vejrhvn30F

// 퍼사드 패턴 (Facade)이란?
// 아래 Facade 클래스에 속한 메서드 process 호출하면 서브 시스템(HelpSystem1, HelpSystem2, HelpSystem3)들의 복잡한 과정을 생각하지 않고 바로 쓸 수 있게 해주는 패턴 

// 

package DesignPattern.Facade;

import DesignPattern.Facade.System.Facade;
// 서브 시스템(HelpSystem1, HelpSystem2, HelpSystem3) 클래스는 같은 패키지에서만 접근할 수 있게 접근 제한자 설정 안 하는 디폴트(default) 클래스로 구현되어 있어서
// 서로 다른 패키지에 존재하는 Application 클래스에서는 접근이 불가하다.
// import DesignPattern.Facade.System.HelpSystem1;

public class Application {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Facade facade = new Facade();
        facade.process(); 
    }
}
