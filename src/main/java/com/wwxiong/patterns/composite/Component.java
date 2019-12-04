package com.wwxiong.patterns.composite;

/**
 * ����ж��������ӿ�
 * ���ʵ�����£�ʵ�������๲�еĽӿ�Ĭ����Ϊ,���ڷ��ʺ͹��� Component �Ӳ���, Component �����ǳ�������߽ӿڡ�
 */
public abstract class Component {

    private String name;
    private String des;

    protected void add(Component component) {
        throw new UnsupportedOperationException();
    }

    protected void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    /**
     * ������
     *
     * @param name
     * @param des
     */
    public Component(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    // print���󷽷�, ��Ҫ����ʵ��
    protected abstract void print();


}
