package DesignPattern.FactoryMethod.concrete;

import java.util.Date;
import DesignPattern.FactoryMethod.framework.Item;
import DesignPattern.FactoryMethod.framework.ItemCreator;


public class MpCreator extends ItemCreator {

    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터베이스에서 마력 회복 물약의 정보를 가져옵니다.");
        System.out.println("데이터베이스에 또 접근");
    }

    @Override
    protected void createItemLog() {
        // TODO : Date 클래스 사용해서 현재 날짜 구하기 (2024.04.17 jbh)
        // 참고 URL - https://korbillgates.tistory.com/117
        System.out.println("마력 회복 물약을 새로 생성 했습니다." + new Date());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
