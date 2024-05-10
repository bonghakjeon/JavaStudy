// GoF의 Design Pattern - 7. Singleton
// 유튜브 참고 URL - 
// https://youtu.be/kAnoWt7Uato?si=i81ZgxraI_AcWQxt

package DesignPattern.Singleton;

public class King {
    // 생성자 king의 접근 제한자 private 지정해서 
    // 나 자신 이외의 어떤 곳에서도 생성자를 호출할 수 없도록 함.
    private King() {}   

    // 오직 객체 1개만 생성되야 하므로 self 필드 정의 
    private static King self = null;

    // 메서드 "getInstance"를 클래스 이름으로 접근할 수 있도록 static 메서드로 구현 
    // synchronized 사용 이유 - 멀티쓰레드 해서 이 메서드 호출시 문제가 없도록 동기화 하기 위함.
    // 싱글쓰레드 환경에서는 굳이 synchronized 사용할 필요 없다.
    public synchronized static King getInstance() {
        if(self == null) {
            self = new King();
        }
        return self;
    }

    public void say() {
        System.out.println("I am only one..");
    }
}
