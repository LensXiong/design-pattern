package com.wwxiong.patterns.composite;

/**
 * Ҷ�ӽڵ㣬Ҷ�ӽڵ�û���ӽڵ�
 */
public class Department extends Component {

    public Department(String name, String des) {
        super(name, des);
    }


    // add , remove �Ͳ���д�ˣ���Ϊ����Ҷ�ӽڵ�

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

}
