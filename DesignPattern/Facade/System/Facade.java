// [자바 디자인 패턴 이해] 스터디
// 14강 퍼사드 패턴 (Facade)
// 유튜브 참고 URL - 
// https://youtu.be/BqDimaIoStQ?si=wTIG_9vejrhvn30F

package DesignPattern.Facade.System;

// 메인 시스템 클래스 Facade
public class Facade {
    private HelpSystem1 helpSystem01;
    private HelpSystem2 helpSystem02;
    private HelpSystem3 helpSystem03;

    public Facade() {
        // 서브시스템 helpSystem01, helpSystem02, helpSystem03 생성 
        helpSystem01 = new HelpSystem1();
        helpSystem02 = new HelpSystem2();
        helpSystem03 = new HelpSystem3();
    }

    public void process() {
        helpSystem01.process();
        helpSystem02.process();
        helpSystem03.process();
    }
}
