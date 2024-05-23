// [자바 디자인 패턴 이해] 스터디
// 12강 방문자 패턴 (Visitor Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/YzFzLpwxSM4?si=f5Jvys3SfZFZ2lHQ

package DesignPattern.Visitor.Concrete;

import DesignPattern.Visitor.Abst.Visitable;
import DesignPattern.Visitor.Abst.Visitor;

public class VisitableA implements Visitable {

    private int age;

    public VisitableA(int age) {
        super();
        this.age = age;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);  // visitor에 메서드 visit 호츨(VisitableA 자기자신을 인자로 전달) 하여 방문 처리 진행 
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
