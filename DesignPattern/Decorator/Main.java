// [자바 디자인 패턴 이해] 
// 11강 데코레이터 패턴 (Decorator Pattern)
// 유튜브 참고 URL - 
// https://youtu.be/VL9OAohbjzI?si=QLu_U_Mlx9wCifuF

package DesignPattern.Decorator;

import java.util.Scanner;

import DesignPattern.Decorator.Abst.IBeverage;
import DesignPattern.Decorator.Concrete.Base;
import DesignPattern.Decorator.Concrete.Espresso;
import DesignPattern.Decorator.Concrete.Milk;


public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        
        // base
        IBeverage beverage = new Base();  // Component의 실질적인 인스턴스 클래스 "Base"로 인터페이스 객체 생성 

        boolean done = false;

        while(false == done) {
            System.out.println("음료 현재 가격 : "+beverage.getTotalPrice());
            System.out.println("선택 : 1:샷 추가 / 2:우유 추가");
            // System.out.print("선택 : 1:샷 추가 / 2:우유 추가");

            switch (sc.nextInt()) {
                case 0:
                    done = true;
                    break;
            
                case 1:
                    beverage = new Espresso(beverage);
                    break;

                case 2:
                    beverage = new Milk(beverage);
                    break;
            }
        }

        System.out.println("음료 가격 : "+beverage.getTotalPrice());
        sc.close();
    }
}
