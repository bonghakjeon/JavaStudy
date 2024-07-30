// [자바 디자인 패턴 이해] 스터디
// 20강 프록시 패턴 (Proxy Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/Nc-3QUJicvo?si=qx9aTDVWb0gx1YwR

package DesignPattern.Proxy.Concrete;

import DesignPattern.Proxy.Interface.Subject;

// 어떤 업무를 대신 수행하는 프록시(대리자 Proxy) 클래스 
// 인터페이스 Subject 로 부터 상속 받은 기능 action1, action2을
// 구현하여 어떤 업무를 대신 수행한다.
public class Proxy implements Subject {

    // 복잡한 업무 action2는 프록시(대리자 Proxy)가 대신할 수 있는 업무 아님
    // 하여 복잡한 업무 action2를 실제로 해줄 수 있는 객체가 필요함.
    // 복잡한 업무 action2를 실제로 해줄 수 있는 객체(Subect real;)는 
    // 외부에 노출되면 안 되므로 접근 제한자 private으로 설정 
    private Subject real;

    public Proxy(Subject real) {
        this.real = real;
    }
        
    @Override
    public void action1() {
        System.out.println("간단한 업무 by 프록시");
    }

    // 복잡한 업무 action2는 프록시(대리자 Proxy)가 대신할 수 있는 업무 아님
    @Override
    public void action2() {
        this.real.action2();
    }
    
}
