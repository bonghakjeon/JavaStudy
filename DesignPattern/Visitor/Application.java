// [자바 디자인 패턴 이해] 스터디
// 12강 방문자 패턴 (Visitor Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/YzFzLpwxSM4?si=f5Jvys3SfZFZ2lHQ

package DesignPattern.Visitor;

import java.util.ArrayList;

import DesignPattern.Visitor.Abst.Visitable;
import DesignPattern.Visitor.Abst.Visitor;
import DesignPattern.Visitor.Concrete.VisitableA;
import DesignPattern.Visitor.Concrete.VisitorA;

// 화장실 다녀와서 12강 방문자 패턴 (Visitor Pattern)
// 동영상 8분 부터 시청 및 소스코드 구현하기 

// 방문자 패턴 (Visitor Pattern) 사용하는 이유?
// VisitorA 클래스의 모양새를 알고 있지만 
// 이 VisitorA 클래스를 수정할 수가 없다. 
// 그런 상황에서 오류 수정 및 유지보수를 하려면 Visitable 클래스 객체(인스턴스) visitable를 만들어서
// 이 객체 visitable이 객체 visitor가 방문을 받아줘서 방문 처리 및 기능이 실행되면은
// 기능이 아무리 복잡하더라도 외부 클래스(VisitableA)에서도 충분히 오류 수정 및 유지보수할 수 있다.

public class Application {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // Visitable v1 = new VisitableA();

        ArrayList<Visitable> visitables = new ArrayList<Visitable>();

        visitables.add(new VisitableA(1));
        visitables.add(new VisitableA(2));
        visitables.add(new VisitableA(3));
        visitables.add(new VisitableA(4));
        visitables.add(new VisitableA(5));

        // 나이총합 구하기 첫 번째 방법
        int ageSum = 0;

        for (Visitable visitable : visitables) {
            ageSum += ((VisitableA) visitable).getAge();
        }

        System.out.println("나이총합 구하기 1 : " + ageSum);

        // 나이총합 구하기 두 번째 방법
        Visitor visitor = new VisitorA();

        for (Visitable visitable : visitables) {
            visitable.accept(visitor);  // 객체 visitable이 객체 visitor가 방문을 받아줘서 나이총합 구하기 실행 
            // ageSum += ((VisitableA) visitable).getAge();
        }

        System.out.println("나이총합 구하기 2 : " + ((VisitorA) visitor).getAgeSum());
    }
}
