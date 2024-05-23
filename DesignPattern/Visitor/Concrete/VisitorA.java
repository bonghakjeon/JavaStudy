// [자바 디자인 패턴 이해] 스터디
// 12강 방문자 패턴 (Visitor Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/YzFzLpwxSM4?si=f5Jvys3SfZFZ2lHQ

package DesignPattern.Visitor.Concrete;

import DesignPattern.Visitor.Abst.Visitable;
import DesignPattern.Visitor.Abst.Visitor;

public class VisitorA implements Visitor {

    private int ageSum;

    public VisitorA() {
        ageSum = 0;
    }

    // 메서드 visit 기능 - VisitorA 클래스 객체(인스턴스)가 VisitableA 클래스 객체(인스턴스) 방문 처리 

    @Override
    public void visit(Visitable visitable) {
        // 메서드 파라미터 visitable이 클래스 VisitableA 유형의 객체(인스턴스)인 경우 
        if (visitable instanceof VisitableA) {

            // VisitableA 클래스 유형의 객체(인스턴스)의 나이(age) 구해서 (메서드 "getAge" 호출)
            // 나이 총합(ageSum)에 나이(age) 더해주기 (나이 총합 구하기 )
            ageSum += ((VisitableA) visitable).getAge();

        } else {

        }
    }

    // 나이 총합(ageSum) 리턴
    
    public int getAgeSum() {
        return ageSum;
    }
    
}
