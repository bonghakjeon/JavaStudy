// [자바 디자인 패턴 이해] 
// 11강 데코레이터 패턴 (Decorator Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/VL9OAohbjzI?si=QLu_U_Mlx9wCifuF

package DesignPattern.Decorator.Concrete;

import DesignPattern.Decorator.Abst.IBeverage;

// Component의 실질적인 인스턴스의 부분이며, 책임(기능)의 주체입니다.

public class Base implements IBeverage {

    @Override
    public int getTotalPrice() {
        return 0;  // 아무것도 없는 상태에서는 가격이 0원 리턴 
    }
    
}
