// [자바 디자인 패턴 이해] 
// 11강 데코레이터 패턴 (Decorator Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/VL9OAohbjzI?si=QLu_U_Mlx9wCifuF

package DesignPattern.Decorator.Abst;

// 컴포넌트 인터페이스 IBeverage

public interface IBeverage {
    // 총 가격 
    int getTotalPrice();
} 
