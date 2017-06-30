package com.ssh.tmall.action;


import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssh.tmall.model.Category;
import com.ssh.tmall.service.impl.CategoryServiceImpl;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2017年6月29日 下午6:04:21
* @version 1.0
*/

@Namespace("/")
@ParentPackage("basicstruts")
@Results({
	@Result(name="listCategory",location="/admin/listCategory.jsp"),
})
public class CategoryAction {
	
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	
	private List<Category> categories;
	
	public void setCategoryServiceImpl(CategoryServiceImpl categoryServiceImpl) {
		this.categoryServiceImpl = categoryServiceImpl;
	}
	public CategoryServiceImpl getCategoryServiceImpl() {
		return categoryServiceImpl;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	
	@Action("admin_category_list")
	public String list(){
		
		this.categories = categoryServiceImpl.list();
		
		return "listCategory";
	}
	

	
}
