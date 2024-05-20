// [자바 디자인 패턴 이해] 스터디
// 9강 브릿지 패턴 (Bridge Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/YrnXcoSvgyE?si=oJ2BfYXJIhMqzHmG

// TODO : 모스 부호 자료 참고 (2024.05.14 jbh)
// 참고 URL - https://ko.wikipedia.org/wiki/%EB%AA%A8%EC%8A%A4_%EB%B6%80%ED%98%B8

package DesignPattern.Bridge;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        // PrintMorseCode code = new PrintMorseCode();
        // code.g();code.a();code.r();code.a();code.m();

        PrintMorseCode code = new PrintMorseCode(new DefaultMCF());   // 모스 부호 자원 DefaultMCF 사용

        // 메서드 체이닝 방식 사용해서 영어 이름 "garam"을 모스 부호 변환
        code.g().a().r().a().m();

        System.out.println();
        System.out.println();

        PrintMorseCode soundCode = new PrintMorseCode(new SoundMCF());   // 음성 메시지 자원 SoundMCF 사용 

        // 메서드 체이닝 방식 사용해서 영어 이름 "garam"을 음성 메시지로 변환
        soundCode.g().a().r().a().m();

        System.out.println();
        System.out.println();

        PrintMorseCode flashCode = new PrintMorseCode(new FlashMCF());   // 빛 메시지 자원 FlashMCF 사용 

        flashCode.g().a().r().a().m();
    }
}
