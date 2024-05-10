// TODO : VSCode java 생성자, getter, setter 자동 생성 확장자 프로그램 다운로드 및 자동 생성하기 (2024.05.03 jbh)
// 참고 URL - https://wings2pc.tistory.com/entry/Tools-Visual-Studio-Codevs-code-%EC%97%90%EC%84%9C-Getter-Setter-%EC%9E%90%EB%8F%99-%EC%83%9D%EC%84%B1

// [자바 디자인 패턴 이해] 
// 7강 빌더 패턴 (Builder Pattern) - 1
// 유튜브 참고 URL - 
// https://youtu.be/SWbW5ZzeARU?si=XNECRxlEok56MvNc

// 빌더 패턴이란? - 많은 인자를 가진 Computer 클래스 객체 computer의 생성을 다른 ComputerFactory 클래스 객체 factory의 도움으로 생성하는 패턴

package DesignPattern.Builder;

public class LgGramBlueprint extends BluePrint {
    
    private Computer computer;

    // 위의 데이터 필드 computer를 안쓰면 아래처럼 String 클래스 객체 데이터 필드 "cpu", "ram", "storage" 사용 해야함. 
    // private String cpu;  

    // private String ram;

    // private String storage;


    public LgGramBlueprint() {
        computer = new Computer("default", "default", "default");
    }

    // 메서드 setCpu 역할 - CPU 설계도 기능 객체  및 객체 computer에 값 할당 기능 
    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    // 메서드 setRam 역할 - RAM 설계도 기능 객체  및 객체 computer에 값 할당 기능 
    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    // 메서드 setStorage 역할 - Storage 설계도 기능 및 객체 computer에 값 할당 기능 
    @Override
    public void setStorage() {
        computer.setStorage("256g ssd");
    }

    // 메서드 getComputer 역할 - 설계도(setCpu, setRam, setStorage)를 가지고 객체 computer 가져오기 기능 
    @Override
    public Computer getComputer() {
        return computer;
    }
}
