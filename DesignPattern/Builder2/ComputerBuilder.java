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

public class ComputerBuilder {

    private Computer computer;

    private ComputerBuilder() {
        computer = new Computer("default", "default", "default");
    }

    public static ComputerBuilder start() {
        return new ComputerBuilder();
    }

    public static ComputerBuilder startWithCpu(String cpu) {
        ComputerBuilder builder = new ComputerBuilder();
        builder.computer.setCpu(cpu);
        return builder;
    }

    public ComputerBuilder setCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    public Computer build() {
        return this.computer;
    }
}
