package DesignPattern.Composite2;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    public Folder(String name) {
        super(name);   // 부모 클래스 Component 생성자 호출 
    }

    List<Component> children = new ArrayList<>();

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
