// [자바 디자인 패턴 이해] 스터디
// 13강 책임사슬 패턴 (Chain of Resposibility) - 1
// 유튜브 참고 URL - 
// https://youtu.be/2Vp-7Pjv-Fg?si=GfwllRuGr5r8TnWC

package DesignPattern.ChainOfResposibility;

public class PlusCalculator extends Calculator {

    @Override
    protected boolean operator(Request request) {
        if(request.getOperator().equals("+")) {
            int a = request.getA();
            int b = request.getB();
            int result = a + b;

            System.out.println(a + "+" + b + "=" + result);
            return true;
        }
        return false;
    }

}
