package com.ssh.tmall.model;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2017年6月29日 下午12:03:13
* @version 1.0
*/


/**
 * 这是实体类Category，代表商品的类别
 * 对应数据库中的category表
 * @version 1.0
 * @author zhuxindong	
 */
public class Category {
	
	/**
	 * 主键
	 */
	private int id; 
	/**
	 * 商品类别的名称
	 */
	private String name;	
	
	/**
	 * getter和setter方法
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
