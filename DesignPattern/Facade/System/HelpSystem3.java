// [자바 디자인 패턴 이해] 스터디
// 14강 퍼사드 패턴 (Facade)
// 유튜브 참고 URL - 
// https://youtu.be/BqDimaIoStQ?si=wTIG_9vejrhvn30F

package DesignPattern.Facade.System;

// 메인 시스템 돕는 서브 시스템 클래스 HelpSystem3
// 같은 패키지에서만 접근할 수 있게 접근 제한자 설정 안 하는 디폴트(default) 클래스로 구현
class HelpSystem3 {
    public HelpSystem3() {
        System.out.println("Call Constructor : " + getClass().getSimpleName());
    }

    public void process() {
        System.out.println("Call Process : " + getClass().getSimpleName());
    }
}
