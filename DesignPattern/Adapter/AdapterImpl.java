// [자바 디자인 패턴 이해] 
// 2강 어댑터 패턴(Adapter Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/gJDZ7pcvlAU?si=JwdbdL6BIkMtY35r

package DesignPattern.Adapter;

public class AdapterImpl implements Adapter {

    // Math math;

    @Override
    public Float twiceOf(Float f) {
        // return (float) Math.twoTime(f.doubleValue());
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        // 로그 찍는 기능 추가 
        System.out.println("절반 함수 호출 시작");
        return (float) Math.half(f.doubleValue());
    }
}
