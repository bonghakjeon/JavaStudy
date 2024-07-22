// [자바 디자인 패턴 이해] 스터디
// 19강 플라이웨이트 패턴 (Flyweight Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/aEar_3UB65M?si=axGUjK_Ov9x-zVLT

package DesignPattern.Flyweight;

import java.util.Map;
import java.util.TreeMap;

// FlyweightManager 클래스 - FlyweightFactory 역할
public class FlyweightFactory {
    Map<String, Flyweight> pool;

    public FlyweightFactory() {
        pool = new TreeMap<>();
    }

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = pool.get(key);

        // 객체 flyweight가 null인 경우 
        if(flyweight == null) {
            flyweight = new Flyweight(key);

            pool.put(key, flyweight);
            System.out.println("새로 생성" + key);
        } else {
            System.out.println("재사용" + key);
        }

        return flyweight;
    }
}
