// [자바 디자인 패턴 이해] 스터디
// 9강 브릿지 패턴 (Bridge Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/YrnXcoSvgyE?si=oJ2BfYXJIhMqzHmG

// TODO : 모스 부호 자료 참고 (2024.05.14 jbh)
// 참고 URL - https://ko.wikipedia.org/wiki/%EB%AA%A8%EC%8A%A4_%EB%B6%80%ED%98%B8

package DesignPattern.Bridge;

public class PrintMorseCode extends MorseCode {
    // garam

    public PrintMorseCode(MorseCodeFunction function) {
        super(function);
    }

    public PrintMorseCode g() {
        dash();
        dash();
        dot();
        space();
        return this;
    }

    public PrintMorseCode a() {
        dot();
        dash();
        space();
        return this;
    }

    public PrintMorseCode r() {
        dot();
        dash();
        dot();
        space();
        return this;
    }

    public PrintMorseCode m() {
        dash();
        dash();
        space();
        return this;
    }
}
