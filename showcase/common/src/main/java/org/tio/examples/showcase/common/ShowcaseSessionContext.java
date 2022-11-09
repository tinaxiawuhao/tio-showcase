package org.tio.examples.showcase.common;

/**
 * 一般生产项目中，都需要定义一个这样的SessionContext，用于保存连接的会话数据
 *
 */
public class ShowcaseSessionContext {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

	}

	private String token = null;

	private String userid = null;

	/**
	 *
	 * 
	 */
	public ShowcaseSessionContext() {
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
}
