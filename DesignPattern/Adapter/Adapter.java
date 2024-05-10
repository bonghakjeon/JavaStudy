// [자바 디자인 패턴 이해] 
// 2강 어댑터 패턴(Adapter Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/gJDZ7pcvlAU?si=JwdbdL6BIkMtY35r

package DesignPattern.Adapter;

public interface Adapter {
    public Float twiceOf(Float f);  // 수의 두배(*2) 수를 반환

    public Float halfOf(Float f); // 수의 반(1/2)의 수를 반환
}
