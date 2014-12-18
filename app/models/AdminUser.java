package models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import play.data.validation.Email;
import play.data.validation.Password;
import play.data.validation.Required;
import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class AdminUser extends Model{
	
	@Required
	public String username;
	
	@Required
	@Password
	public String password;
	
	public String fullname;
	
	/**
	 * 管理员手机号
	 */
	@Required
	public String mobile;
	
	/**
	 * 管理员姓名
	 */
	@Required
	public String realName;
	
	@Email
    @Required
	public String email;
	
	public String address;
	
	@Required
	public boolean status=false;
	
	@Required
	public boolean isAdmin=false;
	
	@Temporal(TemporalType.TIMESTAMP)
	public Date registerDate;
	
	public Date lastLoginDate;
	
	@Required
	@ManyToMany(cascade=CascadeType.PERSIST)
	public List<Role> roles;
	
	public static AdminUser connect(String email, String password) {
        return find("byEmailAndPasswordAndStatus", email, Codec.hexMD5(password),false).first();
    }
	
	public String toString(){
		return email;
	}
	
}
