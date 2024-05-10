// [자바 디자인 패턴 이해] 
// 6강 프로토 타입 패턴(Prototype Pattern) - 2
// 유튜브 참고 URL - 
// https://youtu.be/GA3Oibn4zsg?si=D2MqVIQdDpUq7tj4

package DesignPattern.DeepShallow;

public class Cat implements Cloneable {
    private String name;   // 데이터 필드 name - 이름

    // private Integer age;   // 데이터 필드 age - 나이 
    private Age age;   // 데이터 필드 age - 나이 클래스 Age

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Age getAge() {
        return age;
    }

    public Cat copy() throws CloneNotSupportedException {
        Cat ret = (Cat)this.clone();

        // 사용자 정의 클래스 Age에서도 명시적으로 깊은복사가 진행되도록 아래 코드 추가 
        ret.setAge(new Age(this.age.getYear(), this.age.getValue()));

        return ret;
    }
}
