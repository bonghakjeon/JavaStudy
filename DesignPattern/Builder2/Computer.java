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

public class Computer {
    
    private String cpu;

    private String ram;

    private String storage;

    /*
     *
     * @param cpu 씨피유입니다.
     * @param ram 램입니다.
     * @param storage 저장소입니다.
     * 
     */
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
