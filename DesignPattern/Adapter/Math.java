// [자바 디자인 패턴 이해] 
// 2강 어댑터 패턴(Adapter Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/gJDZ7pcvlAU?si=JwdbdL6BIkMtY35r

package DesignPattern.Adapter;

public class Math {
    // 두배 
    public static double twoTime(double num) { return num*2; }

    // 절반
    public static double half(double num) { return num/2; } 

    // 강화된 알고리즘
    public static Double doubled(Double d) { return d*2; }
}
