package com.ssh.tmall.util;

/**
 * 这个类专门用来进行分页
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2017年6月30日 下午7:25:45
* @version 1.0
*/
public class Page {
	/**
	 * 开始的页数
	 */
	private int start;
	
	/**
	 * 每页显示的条数
	 */
	private int count;
	
	/**
	 * 总共有多少条数据
	 */
	private int total;
	
	/**
	 * 参数
	 */
	private String param;
	
	/**
	 * 默认每页显示5条
	 */
	private static final int defaultCount=5;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}
	
	
	
	
	
	
	
	
	
}
