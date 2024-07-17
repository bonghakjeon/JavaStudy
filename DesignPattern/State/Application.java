// [자바 디자인 패턴 이해] 스터디
// 17강 상태 패턴(State Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/S5wZFxOkBMI?si=aOrjPTSYZ3q0N7YI

package DesignPattern.State;

// 상태 패턴(State Pattern)을 통해 상태를 객체로 나타내고 행동 구현한다.
// 상태 패턴(State Pattern)은 전략 패턴과 유사하고 둘 다 델리게이트 하는 것은 맞다.
// 다만, 차이점이라고 하면 전략 패턴은 알고리즘을 변경해주는 것이고,
// 상태 패턴(State Pattern)은 이벤트로 발생된 것들을 상태에 따라서 다르게 변경 처리 해주고 
// 그 이벤트와 Action들이 상태에도 영향을 미칠 수 있다.

public class Application {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
        Light light = new Light();
        
        light.off();   // 출력 "Nothing" - 꺼져 있는 상태 "lightState = offState;"에서는 아무 것도 안 일어나기 때문
        light.off();   // 출력 "Nothing" - 꺼져 있는 상태 "lightState = offState;"에서는 아무 것도 안 일어나기 때문
        light.off();   // 출력 "Nothing" - 꺼져 있는 상태 "lightState = offState;"에서는 아무 것도 안 일어나기 때문
 
        light.on();    // 출력 "Light ON" - 꺼져 있는 상태 -> 켜진 상태 변경 lightState = onState;
        light.on();    // 출력 "Nothing" - 켜진 상태에서는 아무 것도 안 일어나기 때문
        light.on();    // 출력 "Nothing" - 켜진 상태에서는 아무 것도 안 일어나기 때문

        light.off();   // 출력 "Light OFF" - 켜진 상태 -> 꺼져 있는 상태 변경 lightState = offState;
        light.on();    // 출력 "Light ON" - 꺼져 있는 상태 -> 켜진 상태 변경 lightState = onState;
        light.off();   // 출력 "Light OFF" - 켜진 상태 -> 꺼져 있는 상태 변경 lightState = offState;
        light.on();    // 출력 "Light ON" - 꺼져 있는 상태 -> 켜진 상태 변경 lightState = onState;
        light.off();   // 출력 "Light OFF" - 켜진 상태 -> 꺼져 있는 상태 변경 lightState = offState;
        light.on();    // 출력 "Light ON" - 꺼져 있는 상태 -> 켜진 상태 변경 lightState = onState;
    }
}
