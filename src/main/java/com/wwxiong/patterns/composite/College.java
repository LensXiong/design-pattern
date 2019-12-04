package com.wwxiong.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ��Ҷ�ӽڵ㣬 ���ڴ洢�Ӳ���רҵ
 */
public class College extends Component {

    // List �� ��ŵ�Department
    List<Component> components = new ArrayList<Component>();

    // ������
    public College(String name, String des) {
        super(name, des);
    }

    // ��дadd
    @Override
    protected void add(Component component) {
        // ����ʵ��ҵ���У�Colleage �� add ��  University add ��һ����ȫһ��
        components.add(component);
    }

    // ��дremove
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

    // print������������� University ������ѧԺ
    @Override
    protected void print() {
        System.out.println("--------------" + getName() + "--------------");
        // ���� components
        for (Component component : components) {
            component.print();
        }
    }


}
