// [자바 디자인 패턴 이해] 스터디
// 8강 추상 팩토리 패턴 (Abstract Factory Pattern) - 1
// 유튜브 참고 URL - 
// https://youtu.be/qXcxySA-Qes?si=t275882-9bX_axFh

package DesignPattern.AbsFactory.Abst;

// 자전거 생산 공장 클래스 
public interface BikeFactory {
    public Body createBody();

    public Wheel createWheel();
} 
