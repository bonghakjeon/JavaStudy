package DesignPattern.FactoryMethod.concrete;

import DesignPattern.FactoryMethod.framework.Item;
import DesignPattern.FactoryMethod.framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        
        item.use();

        creator = new MpCreator();
        item = creator.create();

        item.use();

    }
}
