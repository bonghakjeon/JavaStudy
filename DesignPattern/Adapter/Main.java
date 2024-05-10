// [자바 디자인 패턴 이해] 
// 2강 어댑터 패턴(Adapter Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/gJDZ7pcvlAU?si=JwdbdL6BIkMtY35r

package DesignPattern.Adapter;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(80f));
        System.out.println(adapter.halfOf(80f));
        System.out.println(adapter.halfOf(80f));
        System.out.println(adapter.halfOf(80f));
        System.out.println(adapter.halfOf(80f));
    }
}