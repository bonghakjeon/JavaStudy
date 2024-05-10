// [자바 디자인 패턴 이해] 
// 10강 컴포짓 패턴(Composite Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/78uNgDSHw-k?si=fqLynr8tvtn_LlaM


package DesignPattern.Composite;

abstract public class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
