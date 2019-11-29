package com.wwxiong.patterns.prototype.lightclone;


public class ConcreteSheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";
    public ConcreteSheep friend; // 是对象, 克隆是会如何处理

    public ConcreteSheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "ConcreteSheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
    }

    // 克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone() {
        ConcreteSheep concreteSheep = null;
        try {
            concreteSheep = (ConcreteSheep) super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return concreteSheep;
    }


}
