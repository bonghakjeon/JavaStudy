// [자바 디자인 패턴 이해] 스터디
// 8강 추상 팩토리 패턴 (Abstract Factory Pattern) - 1
// 유튜브 참고 URL - 
// https://youtu.be/qXcxySA-Qes?si=t275882-9bX_axFh

package DesignPattern.AbsFactory;

import DesignPattern.AbsFactory.Abst.BikeFactory;
import DesignPattern.AbsFactory.Abst.Body;
import DesignPattern.AbsFactory.Abst.Wheel;
import DesignPattern.AbsFactory.Sam.SamFactory;
import DesignPattern.AbsFactory.gt.GtBikeFactory;

// 추상 팩토리 패턴(Abstract Factory Pattern)이란? 
// 다양한 물건들 (삼천리 자전거, GT 자전거 등...)을 하나의 팩토리(BikeFactory)클래스로 묶어줘서
// 동일한 방식으로 팩토리(BikeFactory)클래스 객체 생성 (factory, gtFactory) 해주는 패턴

public class Main {
    public static void main(String[] args) {
        BikeFactory factory = new SamFactory();
        Body body   = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());

        BikeFactory gtFactory = new GtBikeFactory();
        Body gtBody = gtFactory.createBody();
        Wheel gtWheel = gtFactory.createWheel();

        System.out.println(gtBody.getClass());
        System.out.println(gtWheel.getClass());
    }
}
