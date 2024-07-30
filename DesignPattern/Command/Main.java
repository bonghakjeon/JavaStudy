// [자바 디자인 패턴 이해] 스터디
// 21강 커맨드 패턴 (Command Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/Y5vh-6fsW7Q?si=O8ZyxKyXLCGwVMCA

package DesignPattern.Command;

import java.util.List;
import java.util.PriorityQueue;
import java.util.LinkedList;

import DesignPattern.Command.Concrete.StringPrintCommand;
import DesignPattern.Command.Interface.Command;

// 학습목표
// 커맨드 패턴 (Command Pattern)을 통해 
// 명령(Command)을 객체화 할 수 있다.

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World!");     
        // Command를 구현 해주는 객체(인스턴스)가 있음으로 인해서     
        // 해당 객체(인스턴스)가 Command의 구현체가 된다.

        // 커맨드 패턴 (Command Pattern) 예제 1
        // List<Command> list = new LinkedList<>();

        // list.add(new Command() {
        //     @Override
        //     public void execute() {
        //         System.out.println("작업 1");
        //     }
        // });

        // list.add(new Command() {
        //     @Override
        //     public void execute() {
        //         System.out.println("작업 2");
        //     }
        // });

        // list.add(new Command() {
        //     @Override
        //     public void execute() {
        //         System.out.println("작업 3");
        //     }
        // });

        // for(Command command : list) {
        //     command.execute();
        // }

        // 커맨드 패턴 (Command Pattern) 예제 2
        PriorityQueue<Command> queue = new PriorityQueue<>();
        
        
        queue.add(new StringPrintCommand("ABCD"));
        queue.add(new StringPrintCommand("ABC"));
        queue.add(new StringPrintCommand("AB"));
        queue.add(new StringPrintCommand("A"));

        for(Command command : queue) {
            command.execute();
        }
    }
}
