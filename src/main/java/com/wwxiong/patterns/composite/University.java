package com.wwxiong.patterns.composite;

import java.util.ArrayList;
import java.util.List;

//University ���� Composite , ���Թ���College

/**
 * ��Ҷ�ӽڵ㣬 ���ڴ洢�Ӳ���ѧԺ
 *
 */
public class University extends Component {

	List<Component> components = new ArrayList<Component>();

	// ������
	public University(String name, String des) {
		super(name, des);
	}

	// ��дadd
	@Override
	protected void add(Component component) {
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

	// print�������������University ������ѧԺ
	@Override
	protected void print() {
		System.out.println("--------------" + getName() + "--------------");
		//���� components
		for (Component component : components) {
			component.print();
		}
	}

}
