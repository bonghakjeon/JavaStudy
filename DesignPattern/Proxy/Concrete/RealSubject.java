// [자바 디자인 패턴 이해] 스터디
// 20강 프록시 패턴 (Proxy Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/Nc-3QUJicvo?si=qx9aTDVWb0gx1YwR

package DesignPattern.Proxy.Concrete;

import DesignPattern.Proxy.Interface.Subject;

// 어떤 업무를 대신 수행하는 프록시(대리자 Proxy) 클래스가 
// 처리할 수 없는 복잡한 업무를 대신 처리해 주는 클래스 RealSubject
public class RealSubject implements Subject {

    @Override
    public void action1() {
        System.out.println("간단한 업무 by 실제");
    }

    // 복잡한 업무 action2는 프록시(대리자 Proxy)가 대신할 수 있는 업무 아님
    // 하여 복잡한 업무를 대신 처리해 주는 클래스 RealSubject가 수행함.
    @Override
    public void action2() {
        System.out.println("복잡한 업무 by 실제");
    }
    

}
