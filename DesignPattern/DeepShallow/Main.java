// [자바 디자인 패턴 이해] 
// 6강 프로토 타입 패턴(Prototype Pattern) - 2
// 유튜브 참고 URL - 
// https://youtu.be/GA3Oibn4zsg?si=D2MqVIQdDpUq7tj4

package DesignPattern.DeepShallow;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // System.out.println("Hello world");

        Cat navi = new Cat();
        navi.setName("navi");
        navi.setAge(new Age(2012, 3));

        // Cat yo = navi;  // (얕은 복사) - Cat클래스 객체 navi가 갖고 있는 주소값을 Cat 클래스 객체 yo가 그대로 복사
        // yo.setName("yo");

        // (깊은 복사) - Cat클래스 객체 navi가 갖고 있는 데이터 필드의 값을 Cat 클래스 객체 yo가 그대로 복사 
        Cat yo = navi.copy();
        yo.setName("yo");           // 깊은 복사 진행 - 이름
        // yo.setAge(new Age(2013, 2));  // 깊은 복사 진행 - 나이 클래스 Age

        // 이름(name)제외한 나이 클래스 Age 깊은 복사 오류 발생! 
        // JAVA에서 기본으로 제공하는 String, Integer 등등..의 클래스는 깊은복사 진행시 자동으로 주소값 변경에서 깊은복사 진행하는 기능 실행하지만, 
        // 사용자 정의 클래스 Age는 깊은복사를 진행하지 않고 오류가 발생한다.
        // 하여 깊은복사 진행시 오류가 발생하지 않으려면 Cat 클래스 메서드 copy 실행시 명시적으로 사용자 정의 클래스 Age가 깊은복사 처리 되도록 로직 수정이 필요하다.
        yo.getAge().setYear(2013);  
        yo.getAge().setValue(2);  

        System.out.println(navi.getName());
        System.out.println(navi.getAge().getYear());
        System.out.println(navi.getAge().getValue());

        System.out.println(yo.getName());
        System.out.println(yo.getAge().getYear());
        System.out.println(yo.getAge().getValue());
    }
}
