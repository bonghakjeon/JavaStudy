
// TODO : VSCode 로 자바 소스코드 디버깅 하기(2024.04.18 jbh)
// 참고 URL - https://wikidocs.net/137962

// [자바 디자인 패턴 이해] 
// 5강 싱글톤 패턴(Singleton Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/5jgpu9-ywtY?si=rImw66r7Y4_DRHM9

package DesignPattern.TestSingleton;

public class Main {
    public static void main(String[] args) {
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        // 5,5
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker1.setVolume(11);
        // 11,11
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());

        speaker2.setVolume(22);
        // 22,22
        System.out.println(speaker1.getVolume());
        System.out.println(speaker2.getVolume());
    }
}
