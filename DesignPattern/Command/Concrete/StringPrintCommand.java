// [자바 디자인 패턴 이해] 스터디
// 21강 커맨드 패턴 (Command Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/Y5vh-6fsW7Q?si=O8ZyxKyXLCGwVMCA

package DesignPattern.Command.Concrete;

import DesignPattern.Command.Interface.Command;

public class StringPrintCommand implements Command {

    protected String string;

    public StringPrintCommand(String string) {
        this.string = string;
    }

    @Override
    public int compareTo(Command o) {
        StringPrintCommand other = (StringPrintCommand)o;
        return this.string.length() - other.string.length();
    }

    @Override
    public void execute() {
        System.out.println(this.string);
    }
    
}
