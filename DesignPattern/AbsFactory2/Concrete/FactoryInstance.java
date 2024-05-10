// [자바 디자인 패턴 이해]
// 8강 추상 팩토리 패턴 (Abstract Factory Pattern) - 2
// 유튜브 참고 URL - 
// https://youtu.be/soV1C6j9kkg?si=tA8DIJuZiNXcRPSG

package DesignPattern.AbsFactory2.Concrete;

import DesignPattern.AbsFactory2.Abst.Button;
import DesignPattern.AbsFactory2.Abst.GuiFac;
import DesignPattern.AbsFactory2.Abst.TextArea;


public class FactoryInstance {

    public static GuiFac getGuiFac() {
        
        // System.getProperty("os.name");

        switch (getOsCode()) {
            case 0: return new MacGuiFac();     // 맥일 경우
            case 1: return new LinuxGuiFac();   // 리눅스일 경우 
            case 2: return new WinGuiFac();     // 윈도우일 경우 
        }
        return null;
    }

    private static int getOsCode() {
        // 운영체제 종류가 MAC일 경우 
        if(System.getProperty("os.name").equals("Mac OS X")) {
            return 0;
        }

        else return 2; // 운영체제 종류가 윈도우일 경우 
    }
}

class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("리눅스 버튼 ");
    }
    
}

class LinuxGuiFac implements GuiFac {

    @Override
    public Button createButton() {
        // 리눅스 관련된 네이티브 소스가 있다고 가정 

        return new LinuxButton();
    }

    @Override
    public TextArea creatTextArea() {
        // 리눅스 관련된 네이티브 소스가 있다고 가정 

        return new LinuxTextArea();
    }
    
}

class LinuxTextArea implements TextArea {

    @Override
    public String getText() {
        return "리눅스 텍스트에어리어";
    }
    
}

class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("맥 버튼 ");
    }
    
}

class MacGuiFac implements GuiFac {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea creatTextArea() {
        return new MacTextArea();
    }
    
}

class MacTextArea implements TextArea {

    @Override
    public String getText() {
        return "맥 텍스트 에어리어";
    }
    
}

class WinButton implements Button {

    @Override
    public void click() {
        System.out.println("윈도우 버튼");
    }
    
}

class WinGuiFac implements GuiFac {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea creatTextArea() {
        return new WinTextArea();
    }
    
}

class WinTextArea implements TextArea {

    @Override
    public String getText() {
        return "윈도우 텍스트 에어리어";
    }
    
}
