// [자바 디자인 패턴 이해] 스터디
// 20강 프록시 패턴 (Proxy Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/Nc-3QUJicvo?si=qx9aTDVWb0gx1YwR

// 학습 목표
// 프록시 패턴 (Proxy Pattern)을 통해 작업을 나눠서 구현할 수 있다.

// 기본 설계
// 클라이언트 요청을 프록시(대리자 Proxy)가 받아서 처리하고 
// 프록시(대리자 Proxy)가 처리할 수 없는 업무들은 
// 실제 업무를 처리하는 곳(RealSubject)에서 처리 하도록 한다.

package DesignPattern.Proxy;

import DesignPattern.Proxy.Concrete.Proxy;
import DesignPattern.Proxy.Concrete.RealSubject;
import DesignPattern.Proxy.Interface.Subject;

public class Application {
    public static void main(String[] args) {
        Subject real = new RealSubject();   

        // 간단한 업무를 해야 되는 경우가 여러가지가 있고,
        // 그 기능을 각각의 프록시(대리자 Proxy)들이 관리한다.
        // 다만, 중요한(복잡한) 업무일 때만 실제 객체 real에 요청한다.
        Subject proxy1 = new Proxy(real);

        Subject proxy2 = new Proxy(real);

        proxy1.action1();
        proxy2.action1();

        proxy1.action2();
        proxy2.action2();
    }
}
