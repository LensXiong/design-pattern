package com.wwxiong.patterns.builder;


/**
 * ָ���ߣ�ָ�ӽ������̣����ض�Ӧ�Ĳ�Ʒ
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    // ��ʽһ��ͨ������������ houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // ��ʽ����ͨ��setter ���� houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // ͨ��ָ���ߣ��������췿�ӵ�����
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }


}
