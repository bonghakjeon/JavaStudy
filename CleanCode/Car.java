import java.lang.reflect.Method;

public class Car {
    private final String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void move() {
        this.position++;
    }

    public int getPosition() {
        return position;
    }

    // public static void main() {
    //     Object obj = new Car("foo", 0);
    //     obj.move();
    // }

    public static void main(String[] args) throws Exception {
        Object obj = new Car("foo", 0);
        Class carClass = Car.class;
        Method move = carClass.getMethod("move");

        // move 메서드 실행, 메서드명.invoke(메서드를 실행시킬 객체, 해당 메서드에 넘길 인자)
        move.invoke(obj, null);

        Method getPosition = carClass.getMethod("getPosition");
        int position = (int)getPosition.invoke(obj, null);
        System.out.println(position);
        // 출력 결과: 1
    }
}
