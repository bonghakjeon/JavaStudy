// [자바 디자인 패턴 이해] 
// 6강 프로토 타입 패턴(Prototype Pattern) - 2
// 유튜브 참고 URL - 
// https://youtu.be/GA3Oibn4zsg?si=D2MqVIQdDpUq7tj4

package DesignPattern.DeepShallow;

public class Age {
    int year;

    int value;

    public Age(int year, int value) {
        super();
        this.year = year;
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public int getYear() {
        return year;
    }
}
