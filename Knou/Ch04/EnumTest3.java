package Knou.Ch04;

enum Day1 {
    SUNDAY("일"), MONDAY("월"), TUESDAY("화"), WEDNESDAY("수"),
    THURSDAY("목"), FRIDAY("금"), SATHURDAY("토");

    private final String name;
    private Day1(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

public class EnumTest3 {
    public static void main(String[] args) {
        for(Day1 d: Day1.values()) {
            System.out.print(d.getName() + " ");
        }
    }
}
