// 소스파일에 작성된 주석 설명 내용 읽기 위해 JavaDoc 활성화 하기 
// 유튜브 참고 URL 
// https://youtu.be/Rk4__gTUlAY?si=4bDFf-9N3CVYeIe3

// [자바 디자인 패턴 이해] 
// 7강 빌더 패턴 (Builder Pattern) - 2
// 유튜브 참고 URL - 
// https://www.youtube.com/watch?v=aAu2wqJsUxg

// 빌더 패턴이란?
// 많은 인자를 가진 Computer 클래스 객체(computer, computer2)의 생성을 다른 ComputerBuilder 클래스 객체(builder)의 도움으로 생성하는 패턴

package DesignPattern.Builder2;

public class Main {
    public static void main(String[] args) {
        // Computer 클래스 객체 computer 생성시 생성자에 파라미터 String cpu, String ram, String storage 값을 잘못 넣는 경우 
        // Computer computer = new Computer("256g ssd", "i7", "8g");   

        // 첫 번째 방법 - 메서드 체이닝 static 메서드 start 호출 방식 
        // ComputerBuilder 클래스에 속한 메서드를 가지고 메서드 체이닝(체인 메서드) 호출해서 Computer 클래스 객체 생성 
        // 아래처럼 메서드 체이닝(체인 메서드)식으로 호출하는 이유는 위에 처럼 생성자에 전달한 파라미터에 잘못된 값을 넣지 않기 위함이다.
        Computer computer = ComputerBuilder.start()
                                           .setCpu("i7")
                                           .setRam("8g")
                                           .setStorage("128g ssd")
                                           .build();

        // 두 번째 방법 - 메서드 체이닝 static 메서드 startWithCpu 호출 방식 
        // ComputerBuilder 클래스에 속한 메서드를 가지고 메서드 체이닝(체인 메서드) 호출해서 Computer 클래스 객체 생성 
        // 아래처럼 메서드 체이닝(체인 메서드)식으로 호출하는 이유는 위에 처럼 생성자에 전달한 파라미터에 잘못된 값을 넣지 않기 위함이다.
        Computer computer2 = ComputerBuilder.startWithCpu("i7")
                                            .setRam("8g")
                                            .setStorage("128g ssd")
                                            .build();

        System.out.println("computer 객체 정보 : " + computer.toString());

        System.out.println("computer2 객체 정보 : " + computer2.toString());
    }
}
