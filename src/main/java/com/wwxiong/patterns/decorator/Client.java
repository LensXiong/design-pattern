package com.wwxiong.patterns.decorator;

public class Client {

    /**
     * װ����ģʽ�µĶ�����2���ɿ���+һ��ţ�̵�LongBlack
     *
     * @param args
     */
    public static void main(String[] args) {

        // 1. ��һ�� CoffeeLongBlack
        Drink order = new CoffeeLongBlack();
        System.out.println(order.getDes() + " and total price is " + order.cost());

        // 2. order ����һ��ţ��
        order = new DrinkMilk(order);
        System.out.println(order.getDes() + " and total price is " + order.cost());

        // 3. order ����һ���ɿ���
        order = new DrinkChocolate(order);
        System.out.println(order.getDes() + " and total price is " + order.cost());

        // 4. order �ټ���һ���ɿ���
        order = new DrinkChocolate(order);
        System.out.println(order.getDes() + " and total price is " + order.cost());
    }

}
