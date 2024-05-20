// [자바 디자인 패턴 이해] 스터디
// 9강 브릿지 패턴 (Bridge Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/YrnXcoSvgyE?si=oJ2BfYXJIhMqzHmG

// TODO : 모스 부호 자료 참고 (2024.05.14 jbh)
// 참고 URL - https://ko.wikipedia.org/wiki/%EB%AA%A8%EC%8A%A4_%EB%B6%80%ED%98%B8

package DesignPattern.Bridge;

public class MorseCode {

    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }

    public void setFunction(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot() {
        function.dot();     // function.dot(); 호출 - 델리게이트(위임) 사용
    }

    public void dash() {
        function.dash();    // function.dash(); 호출 - 델리게이트(위임) 사용
    }

    public void space() {
        function.space();   // function.space(); 호출 - 델리게이트(위임) 사용
    }
}
