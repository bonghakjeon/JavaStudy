// [자바 디자인 패턴 이해] 
// 10강 컴포짓 패턴(Composite Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/78uNgDSHw-k?si=fqLynr8tvtn_LlaM

package DesignPattern.Composite;

public class File extends Component {

    public File(String name) {
        super(name);
    }

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
