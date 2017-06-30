package com.ssh.tmall.service;

import java.util.List;

import com.ssh.tmall.model.Category;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2017年6月29日 下午2:20:31
* @version 1.0
*/

public interface CategoryService {
	
	/**
	 * 查询所有商品类别
	 * @return List<Category>
	 */
	List<Category> list();
	
	/**
	 * 持久化一个商品类别
	 * @param category
	 */
	void save(Category category);

	
}
