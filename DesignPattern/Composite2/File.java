// [자바 디자인 패턴 이해] 스터디
// 10강 컴포짓 패턴(Composite Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/78uNgDSHw-k?si=LaXQiyjera9plEi6

package DesignPattern.Composite2;

public class File extends Component {
    
    public File(String name) {
        super(name);   // 부모 클래스 Component 생성자 호출 

    }

    // 파일 정보(데이터)
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
