// [자바 디자인 패턴 이해] 스터디
// 19강 플라이웨이트 패턴 (Flyweight Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/aEar_3UB65M?si=axGUjK_Ov9x-zVLT

// 학습목표
// 플라이웨이트 패턴 (Flyweight Pattern)을 통해 
// 메모리 공간을 절약할 수 있다. (메모리를 가볍게 유지시켜 준다.)

package DesignPattern.Flyweight;

// main 메서드 - 클라이언트 기능 수행 
public class Application {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight = factory.getFlyweight("A");

        System.out.println(flyweight);   // 출력 - "새로 생성A"

        flyweight = factory.getFlyweight("A");

        System.out.println(flyweight);   // 출력 - "재사용A" (위에서 새로 생성한 객체(Flyweight flyweight = factory.getFlyweight("A");)가 그대로 넘어옴.)

        flyweight = factory.getFlyweight("A");

        System.out.println(flyweight);   // 출력 - "재사용A" (위에서 새로 생성한 객체(Flyweight flyweight = factory.getFlyweight("A");)가 그대로 넘어옴.)


        flyweight = factory.getFlyweight("B");

        System.out.println(flyweight);   // 출력 - "새로 생성B"

        flyweight = factory.getFlyweight("B");

        System.out.println(flyweight);   // 출력 - "재사용B" (위에서 새로 생성한 객체(flyweight = factory.getFlyweight("B");)가 그대로 넘어옴.)
    }
}
