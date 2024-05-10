// [자바 디자인 패턴 이해] 스터디
// 8강 추상 팩토리 패턴 (Abstract Factory Pattern) - 1
// 유튜브 참고 URL - 
// https://youtu.be/qXcxySA-Qes?si=t275882-9bX_axFh

package DesignPattern.AbsFactory.Sam;

import DesignPattern.AbsFactory.Abst.BikeFactory;
import DesignPattern.AbsFactory.Abst.Body;
import DesignPattern.AbsFactory.Abst.Wheel;

// 브랜드 삼천리 자전거 생산 공장 클래스 (인터페이스 BikeFactory 상속)
public class SamFactory implements BikeFactory {

    @Override
    public Body createBody() {
        return new SamBody();
    }

    @Override
    public Wheel createWheel() {
        return new SanWheel();
    }
    
}
