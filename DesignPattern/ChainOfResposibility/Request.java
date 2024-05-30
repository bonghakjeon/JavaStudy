// [자바 디자인 패턴 이해] 스터디
// 13강 책임사슬 패턴 (Chain of Resposibility) - 1
// 유튜브 참고 URL - 
// https://youtu.be/2Vp-7Pjv-Fg?si=GfwllRuGr5r8TnWC

package DesignPattern.ChainOfResposibility;

public class Request {
    private int a, b;

    private String operator;

    public Request(int a, int b, String operator) {
        super();
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
