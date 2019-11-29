package com.wwxiong.patterns.decorator;

/**
 * 继承 Drink + 组合 Drink
 */
public class Decorator extends Drink {
    // 组合Drink
    private Drink obj;

    /**
     * 构造器
     *
     * @param obj
     */
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice 自己价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() 输出被装饰者的描述
        return des + " " + getPrice() + " && " + obj.getDes();
    }


}
