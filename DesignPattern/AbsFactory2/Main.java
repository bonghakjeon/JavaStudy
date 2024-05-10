// [자바 디자인 패턴 이해]
// 8강 추상 팩토리 패턴 (Abstract Factory Pattern) - 2
// 유튜브 참고 URL - 
// https://youtu.be/soV1C6j9kkg?si=tA8DIJuZiNXcRPSG

package DesignPattern.AbsFactory2;

import DesignPattern.AbsFactory2.Abst.Button;
// import DesignPattern.AbsFactory2.Abst.Button;
import DesignPattern.AbsFactory2.Abst.GuiFac;
import DesignPattern.AbsFactory2.Abst.TextArea;
// import DesignPattern.AbsFactory2.Abst.TextArea;
import DesignPattern.AbsFactory2.Concrete.FactoryInstance;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World");

        GuiFac fac = FactoryInstance.getGuiFac();
        Button button = fac.createButton();
        TextArea area = fac.creatTextArea();

        button.click();
        System.out.println(area.getText());
        // System.out.println(System.getProperty("os.name"));

        // TODO : 아래 주석친 코드들은 잘못된 방식으로 Gui 컴포넌트 클래스 Button, TextArea 객체 생성 해줘서 주석 처리 (2024.05.10 jbh)
        // 잘못된 방식인 이유? 
        // 어떤 OS 환경에서도 원활하게 실행되게 하기 위해서는 
        // 클래스 "LinuxGuiFac, LinuxButton, LinuxTextArea", "MacGuiFac, MacButton, MacTextArea", "WinGuiFac, WinButton, WinTextArea"를 외부로 노출시키면 안 된다.
        // 예를들어 윈도우 OS 환경인데 리눅스 Gui 관련 클래스 객체를 생성하면 오류가 발생할 수 있기 때문에 아래와 같은 방식으로 하면 안 된다.

        // 리눅스 Gui
        // GuiFac linuxFac = new LinuxGuiFac();
        // Button linuxButton = linuxFac.createButton();
        // TextArea linuxArea = linuxFac.creatTextArea();

        // linuxButton.click();
        // System.out.println(linuxArea.getText());

        // System.out.println();

        // 맥 Gui
        // GuiFac macFac = new MacGuiFac();
        // Button macButton = macFac.createButton();
        // TextArea macArea = macFac.creatTextArea();

        // macButton.click();
        // System.out.println(macArea.getText());

        // System.out.println();

        // 윈도우 Gui
        // GuiFac winFac = new WinGuiFac();
        // Button winButton = winFac.createButton();
        // TextArea winArea = winFac.creatTextArea();

        // winButton.click();
        // System.out.println(winArea.getText());

        // System.out.println();
    }
}
