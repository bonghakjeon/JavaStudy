// [자바 디자인 패턴 이해] 
// 11강 데코레이터 패턴 (Decorator Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/VL9OAohbjzI?si=QLu_U_Mlx9wCifuF

package DesignPattern.Decorator.Abst;

// 컴포넌트와 장식(데코레이터)을 동일시 해주는 역할 클래스

abstract public class AbstAdding implements IBeverage {

    private IBeverage base;
    
    public AbstAdding(IBeverage base) {
        super();
        this.base = base;
    }

    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }

    protected IBeverage getBase() {
        return base;
    }
}
