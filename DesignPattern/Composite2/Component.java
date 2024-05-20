// [자바 디자인 패턴 이해] 스터디
// 10강 컴포짓 패턴(Composite Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/78uNgDSHw-k?si=LaXQiyjera9plEi6

package DesignPattern.Composite2;

// 컴포넌트 클래스 Component가 폴더 및 파일 이름(name) 값을 가지도록 abstract 추상 클래스로 구현 
abstract public class Component {
    public Component(String name) {
        this.name = name;
    }

    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
