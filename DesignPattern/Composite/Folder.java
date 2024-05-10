// [자바 디자인 패턴 이해] 
// 10강 컴포짓 패턴(Composite Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/78uNgDSHw-k?si=fqLynr8tvtn_LlaM

package DesignPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    public Folder(String name) {
        super(name);
    }

    List<Component> children = new ArrayList<Component>();

    public boolean addComponent(Component component) {
        return children.add(component);
    }

    public boolean removeComponent(Component component) {
        return children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }
}
