package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.Model;


/**
 * 验证码列表
 * 1.用户验证码
 * 2.邮箱验证码
 * 3.移动电话验证码
 * @author zhangpeng
 *
 */
@Entity
public class VerifyCode extends Model {
	
	/**
	 * 用户名
	 */
	
	public String username;
	
	/**
	 * 用户验证码
	 */
	
	public String active_code;
	
	/**
	 * 邮箱验证码
	 */
	
	public String verify_email_code;
	
	/**
	 * 移动电话验证码
	 */
	
	public String verify_mobile_code;
	

}
