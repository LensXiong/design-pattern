package com.wwxiong.patterns.decorator;

public abstract class Drink {

    public String des;
    private float price = 0.0f;

    public String getDes() {
        return des + ' ' + price;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算费用 - 抽象方法 - 子类实现
     *
     * @return
     */
    public abstract float cost();

}
