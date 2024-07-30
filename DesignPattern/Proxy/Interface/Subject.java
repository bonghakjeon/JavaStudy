// [자바 디자인 패턴 이해] 스터디
// 20강 프록시 패턴 (Proxy Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/Nc-3QUJicvo?si=qx9aTDVWb0gx1YwR

package DesignPattern.Proxy.Interface;

// 프록시(대리자 Proxy) 기능을 가지고 있는 인터페이스 Subject
public interface Subject {

    void action1();   // 리소스가 적게 드는 일(단순 이름을 묻는지 등의 가벼운 업무)

    void action2();   // 리소스가 많이 드는 일(네트워크, 메모리 등이 많이 사용되는 업무)
}
