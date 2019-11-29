package com.wwxiong.patterns.decorator;

public class Client {

    /**
     * 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack
     *
     * @param args
     */
    public static void main(String[] args) {

        // 1. 点一份 CoffeeLongBlack
        Drink order = new CoffeeLongBlack();
        System.out.println(order.getDes() + " and total price is " + order.cost());

        // 2. order 加入一份牛奶
        order = new DrinkMilk(order);
        System.out.println(order.getDes() + " and total price is " + order.cost());

        // 3. order 加入一份巧克力
        order = new DrinkChocolate(order);
        System.out.println(order.getDes() + " and total price is " + order.cost());

        // 4. order 再加入一份巧克力
        order = new DrinkChocolate(order);
        System.out.println(order.getDes() + " and total price is " + order.cost());
    }

}
