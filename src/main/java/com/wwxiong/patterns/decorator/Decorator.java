package com.wwxiong.patterns.decorator;

/**
 * �̳� Drink + ��� Drink
 */
public class Decorator extends Drink {
    // ���Drink
    private Drink obj;

    /**
     * ������
     *
     * @param obj
     */
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice �Լ��۸�
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() �����װ���ߵ�����
        return des + " " + getPrice() + " && " + obj.getDes();
    }


}
