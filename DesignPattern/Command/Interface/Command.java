// [자바 디자인 패턴 이해] 스터디
// 21강 커맨드 패턴 (Command Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/Y5vh-6fsW7Q?si=O8ZyxKyXLCGwVMCA

package DesignPattern.Command.Interface;

// 우선 순위 큐(PriorityQueue)에서 명령(Command) 인터페이스가 우선 순위를 가지려면
// 명령(Command) 인터페이스에 extends Comparable<Command> 추가 및 StringPrintCommand 구현 해야함.
public interface Command extends Comparable<Command> {
    void execute();

    // void action();
    // void undo();
}
