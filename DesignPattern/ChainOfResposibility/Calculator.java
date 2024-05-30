// [자바 디자인 패턴 이해] 스터디
// 13강 책임사슬 패턴 (Chain of Resposibility) - 1
// 유튜브 참고 URL - 
// https://youtu.be/2Vp-7Pjv-Fg?si=GfwllRuGr5r8TnWC

package DesignPattern.ChainOfResposibility;

public abstract class Calculator {

    private Calculator preCalculator;

    public void setNextCalculator(Calculator nextCalculator) {
        this.preCalculator = nextCalculator;
    }

    public boolean process(Request request) {
        if(preCalculator != null) 
            if(preCalculator.process(request))
                return true;

        return operator(request);
    }


    abstract protected boolean operator(Request request);
}
