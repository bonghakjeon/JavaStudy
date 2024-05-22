// [자바 디자인 패턴 이해] 
// 11강 데코레이터 패턴 (Decorator Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/VL9OAohbjzI?si=QLu_U_Mlx9wCifuF

package DesignPattern.Decorator.Concrete;

import DesignPattern.Decorator.Abst.AbstAdding;
import DesignPattern.Decorator.Abst.IBeverage;

// 실질적인 장식(데코레이터) 인스턴스 및 정의이며, 책임(기능)이 추가되는 부분입니다.

public class Espresso extends AbstAdding {

    static protected int espressoCount = 0;

    public Espresso(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+getAddPrice();   // 부모 클래스 AbstAdding 메서드 "getTotalPrice" 호출 결과 + 자식 클래스 Espresso static 메서드 "getAddPrice" 리턴 
    }

    // 에스프레소 추가 가격
    private static int getAddPrice() {
        espressoCount += 1;
        int addPrice = 100;    // 에스프레소 1샷 추가할 때는 100 추가 

        if(espressoCount > 1) {
            addPrice = 70;     // 에스프레소 2샷 이상일 때는 70 추가 
        }

        return addPrice;
    }


}
