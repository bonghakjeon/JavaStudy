// [자바 디자인 패턴 이해] 스터디
// 19강 플라이웨이트 패턴 (Flyweight Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/aEar_3UB65M?si=axGUjK_Ov9x-zVLT

package DesignPattern.Flyweight;

public class Flyweight {

    public Flyweight(String data) {
        this.data = data;
    }

    private String data;

    public String getData() {
        return data;
    }
}
