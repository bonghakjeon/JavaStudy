// [자바 디자인 패턴 이해] 스터디
// 12강 방문자 패턴 (Visitor Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/YzFzLpwxSM4?si=f5Jvys3SfZFZ2lHQ

package DesignPattern.Visitor.Abst;

public interface Visitable {
    public void accept(Visitor visitor);  
}
