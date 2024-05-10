// [자바 디자인 패턴 이해]
// 8강 추상 팩토리 패턴 (Abstract Factory Pattern) - 2
// 유튜브 참고 URL - 
// https://youtu.be/soV1C6j9kkg?si=tA8DIJuZiNXcRPSG

package DesignPattern.AbsFactory2.Abst;

// Gui 컴포넌트 클래스 Button, TextArea 객체 생성 시켜주는 인터페이스 GuiFac
public interface GuiFac {
    public Button createButton();

    public TextArea creatTextArea();
} 
