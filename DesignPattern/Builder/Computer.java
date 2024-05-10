// TODO : VSCode java 생성자, getter, setter 자동 생성 확장자 프로그램 다운로드 및 자동 생성하기 (2024.05.03 jbh)
// 참고 URL - https://wings2pc.tistory.com/entry/Tools-Visual-Studio-Codevs-code-%EC%97%90%EC%84%9C-Getter-Setter-%EC%9E%90%EB%8F%99-%EC%83%9D%EC%84%B1

// [자바 디자인 패턴 이해] 
// 7강 빌더 패턴 (Builder Pattern) - 1
// 유튜브 참고 URL - 
// https://youtu.be/SWbW5ZzeARU?si=XNECRxlEok56MvNc

package DesignPattern.Builder;

// 빌더 패턴이란? - 많은 인자를 가진 Computer 클래스 객체 computer의 생성을 다른 ComputerFactory 클래스 객체 factory의 도움으로 생성하는 패턴

public class Computer {
    
    private String cpu;

    private String ram;

    private String storage;

    public Computer(String cpu, String ram, String storage) {
        super();
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }; 

    public String getCpu() {
        return this.cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return this.ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return this.storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return cpu+","+ram+","+storage;
    }

}
