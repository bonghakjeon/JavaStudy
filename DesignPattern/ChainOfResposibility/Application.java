// [자바 디자인 패턴 이해] 스터디
// 13강 책임사슬 패턴 (Chain of Resposibility) - 1
// 유튜브 참고 URL - 
// https://youtu.be/2Vp-7Pjv-Fg?si=GfwllRuGr5r8TnWC

package DesignPattern.ChainOfResposibility;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Calculator plus = new PlusCalculator();
        Calculator sub = new SubCalculator();

        plus.setNextCalculator(sub);  // 먼저 덧셈(plus) 처리 해보고 안 되면 뺄샘(sub)으로 넘겨줌.

        Request request1 = new Request(1, 2, "+");    // 3
        Request request2 = new Request(10, 2, "-");   // 8

        plus.process(request1);
        plus.process(request2);

    }
}
