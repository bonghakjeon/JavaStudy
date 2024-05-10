
// TODO : VSCode 로 자바 소스코드 디버깅 하기(2024.04.18 jbh)
// 참고 URL - https://wikidocs.net/137962

// [자바 디자인 패턴 이해] 
// 5강 싱글톤 패턴(Singleton Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/5jgpu9-ywtY?si=rImw66r7Y4_DRHM9

package DesignPattern.TestSingleton;

public class SystemSpeaker {
    
    static private SystemSpeaker instance;
    private int volume;

    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if (instance == null) {
            // 시스템 스피커
            instance = new SystemSpeaker();
            System.out.println("시스템 스피커 새로 생성");
        } else {
            System.out.println("이미 생성");
        }

        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
