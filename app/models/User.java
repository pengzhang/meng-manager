package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class User extends Model{

	/**
	 * 用户名
	 */
	
	public String username;
	
	
	public String code = Codec.UUID();
	
	/**
	 * 密码
	 */
	
	public String password;

	/**
	 * 是否高级会员
	 */
	
	public boolean isVip;
	
	/**
	 * 真实姓名
	 */
	
	public String realName;
	
	/**
	 * 昵称
	 */
	
	public String nickName;
	
	/**
	 * 身份证号
	 */
	
	public String cardId;
	
	/**
	 * 性别
	 */
	
	public boolean gender;
	
	/**
	 * 电子邮箱
	 */
	
	public String email;
	
	/**
	 * 移动电话
	 */
	
	public String mobile;
	
	/**
	 * 电话号码
	 */
	
	public String tel;
	
	/**
	 * 公司名称
	 */
	
	public String company;
	
	
	public boolean status = false; 
	
}
