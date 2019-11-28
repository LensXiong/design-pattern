package com.wwxiong.patterns.builder;


/**
 * ����Ľ�����
 */
public abstract class HouseBuilder {

    protected House house = new House();

    // �������̵ĳ��󷽷�������ʵ�ֽ�����������ɡ�
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    // ���ز�Ʒ
    public House buildHouse() {
        return house;
    }

}
