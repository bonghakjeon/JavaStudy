// [자바 디자인 패턴 이해] 스터디
// 17강 상태 패턴(State Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/S5wZFxOkBMI?si=aOrjPTSYZ3q0N7YI

package DesignPattern.State;

// Light 클래스가 어떻게 되어 있는지 외부에서 확인하기 어렵게 구현이 되어 있다.
// 왜냐하면 불이 꺼지고 켜지는 것만 알면 되지 나머지 구체적인 건 몰라도 되기 때문이다.
// (예) offState, onState 둘다 접근 제한자 private 설정, lightState 접근 제한자 protected 설정
public class Light {

    protected LightState lightState;

    // LightState 클래스 객체 offState 필드로 선언
    // 메서드 on, off를 정의 하도록 익명 클래스 방식으로 구현 
    private LightState offState = new LightState() {

        // 불 꺼진 상태에서 동작하는 Action - on()
        @Override
        public void on() {
            System.out.println("Light ON");
            lightState = onState;
        }

        // 불 꺼진 상태에서 동작하는 Action - off()
        @Override
        public void off() {
            System.out.println("Nothing");
        }
        
    };

    // LightState 클래스 객체 onState 필드로 선언
    // 메서드 on, off를 정의 하도록 익명 클래스 방식으로 구현 
    private LightState onState = new LightState() {

        // 불 켜진 상태에서 동작하는 Action - on()
        @Override
        public void on() {
            System.out.println("Nothing");
        }

        // 불 켜진 상태에서 동작하는 Action - off()
        @Override
        public void off() {
            System.out.println("Light OFF");
            lightState = offState;
        }
        
    };

    public Light() {
        lightState = offState; 
    }
    
    // action - 불 키기 
    public void on() {
        lightState.on();
    }

    // actuib - 불 끄기
    public void off() {
        lightState.off();
    }
}


interface LightState {
    void on();
    void off();
}