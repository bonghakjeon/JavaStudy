// [자바 디자인 패턴 이해] 
// 11강 데코레이터 패턴 (Decorator Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/VL9OAohbjzI?si=QLu_U_Mlx9wCifuF

package DesignPattern.Decorator.Concrete;

import DesignPattern.Decorator.Abst.AbstAdding;
import DesignPattern.Decorator.Abst.IBeverage;

// 실질적인 장식(데코레이터) 인스턴스 및 정의이며, 책임(기능)이 추가되는 부분입니다.

public class Milk extends AbstAdding {

    public Milk(IBeverage material) {
        super(material);
    }
    
    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+50; // 부모 클래스 AbstAdding 메서드 "getTotalPrice" 호출 결과 + 50 리턴 
    }
}
