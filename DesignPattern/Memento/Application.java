// [자바 디자인 패턴 이해] 스터디
// 18강 메멘토 패턴 (Memento Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/LA4__iGMXKA?si=r1uZMiVxwRCRizEx

// 학습목표
// 메멘토 패턴을 통해 객체의 상태를 
// 저장하고 이전 상태로 복구한다.
// 접근 제한자 protected의 사용을 이해한다.

package DesignPattern.Memento;

import java.util.Stack;

import DesignPattern.Memento.Abst.Memento;
import DesignPattern.Memento.Abst.Originator;

public class Application {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        // Memento 클래스 객체 memento를 넣어주는 CareTaker를 Stack 클래스 객체 mementos로 구현 
        Stack<Memento> mementos = new Stack<>();

        Originator originator = new Originator();

        originator.setState("state 1");
        // Memento memento = originator.createMemento();
        mementos.push(originator.createMemento());

        originator.setState("state 2");
        mementos.push(originator.createMemento());

        // 개발자가 악의적인 의도를 가지고 잘못된 Memento 클래스 객체 memento 생성 및 
        // CareTaker Stack 클래스 객체 mementos에 데이터를 잘못된 상태로 넣어준 경우 (memento = new Memento("state something"); / state += "23";)
        // 상태값이 악의적으로 변경("state something", "23")될 수 있다.
        // 이런 잘못된 값이 들어가는 것을 막기 위해 
        // Memento 클래스의 생성자와 메서드 "getState"의 접근제한자를 public -> protected로 변경해서
        // Memento 클래스를 상속 받지 않는 외부 클래스에서 Memento 클래스의 생성자와 메서드 "getState"를 접근하지 못 하도록 
        // 보안을 강화하는 형식으로 구현한다.
        // Memento memento = originator.createMemento();
        // memento = new Memento("state something");
        // String state = memento.getState();
        // state += "23";
        // mementos.push(memento);

        originator.setState("state 3");
        mementos.push(originator.createMemento());

        originator.setState("state Final");
        mementos.push(originator.createMemento());

        // 방법 1 - CareTaker에 저장된 Memento 클래스 객체 memento를 꺼내기 
        // originator.restoreMemento(mementos.pop());   // 원래 상태로 복구 

        // 방법 2 - CareTaker에 저장된 Memento 클래스 객체 memento를 꺼내기 
        originator.restoreMemento(mementos.pop());   // 원래 상태로 복구 
        // originator의 상태값 가져오기 
        System.out.println(originator.getState());   // state Final

        originator.restoreMemento(mementos.pop());   // 원래 상태로 복구 
        // originator의 상태값 가져오기 
        System.out.println(originator.getState());   // state 3

        originator.restoreMemento(mementos.pop());   // 원래 상태로 복구 
        // originator의 상태값 가져오기 
        System.out.println(originator.getState());   // state 2

        originator.restoreMemento(mementos.pop());   // 원래 상태로 복구 
        // originator의 상태값 가져오기 
        System.out.println(originator.getState());   // state 1
    }
}
