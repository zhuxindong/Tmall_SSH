package com.ssh.tmall.dao;

import java.util.List;

import com.ssh.tmall.model.Category;

/**
 * Categoty的DAO接口
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2017年6月29日 下午2:04:14
* @version 1.0
*/

public interface CategoryDAO {
	
	/**
	 * 查询所有商品类别
	 * @return List<Category>
	 */
	List<Category> list();
	
	
	/**
	 * 持久化一个分类
	 * @param category
	 */
	void save(Category category);

}
