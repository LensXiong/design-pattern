package com.wwxiong.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 非叶子节点， 用于存储子部件专业
 */
public class College extends Component {

    // List 中 存放的Department
    List<Component> components = new ArrayList<Component>();

    // 构造器
    public College(String name, String des) {
        super(name, des);
    }

    // 重写add
    @Override
    protected void add(Component component) {
        // 将来实际业务中，Colleage 的 add 和  University add 不一定完全一样
        components.add(component);
    }

    // 重写remove
    @Override
    protected void remove(Component component) {
        components.remove(component);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // print方法，就是输出 University 包含的学院
    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
        // 遍历 components
        for (Component component : components) {
            component.print();
        }
    }


}
