package top.laijie.blogs.domain;

import java.util.Date;

/**
 * 用户表
 * @author laijie
 *
 */
public class Users {
	/**
	 * 自增长字段
	 */
	private int id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 显示名称
	 */
	private String nicename;
	/**
	 * 邮件地址
	 */
	private String email;
	/**
	 * 注册时间;
	 */
	private Date registered;
	/**
	 * 状态:
	 * 0-禁用
	 * 1-可用
	 */
	private int status;
	/**
	 * 等级 :
	 * 0-普通用户
	 * 1-管理员
	 */
	private int level;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNicename() {
		return nicename;
	}
	public void setNicename(String nicename) {
		this.nicename = nicename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegistered() {
		return registered;
	}
	public void setRegistered(Date registered) {
		this.registered = registered;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
}
