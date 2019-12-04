package com.wwxiong.patterns.composite;

import java.util.ArrayList;
import java.util.List;

//University 就是 Composite , 可以管理College

/**
 * 非叶子节点， 用于存储子部件学院
 *
 */
public class University extends Component {

	List<Component> components = new ArrayList<Component>();

	// 构造器
	public University(String name, String des) {
		super(name, des);
	}

	// 重写add
	@Override
	protected void add(Component component) {
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

	// print方法，就是输出University 包含的学院
	@Override
	protected void print() {
		System.out.println("--------------" + getName() + "--------------");
		//遍历 components
		for (Component component : components) {
			component.print();
		}
	}

}
