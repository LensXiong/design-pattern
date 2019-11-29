package com.wwxiong.patterns.decorator;

/**
 * 具体的装饰者
 */
public class DrinkChocolate extends Decorator {

    /**
     * 构造器
     * @param obj
     */
    public DrinkChocolate(Drink obj) {
        super(obj);
        setDes("DrinkChocolate");
        setPrice(3.0f);
    }

}
