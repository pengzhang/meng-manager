package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.Model;

/**
 * 新闻分类管理
 * @author zhangpeng
 *
 */

@Entity
public class NewsCategory extends Model{
	
	/**
	 * 新闻分类Code
	 */
	
	@Required
	public String category_code;
	
	/**
	 * 新闻分类标题
	 */
	
	@Required
	public String category_title;
	
	public String web_site_code;
	
	/**
	 * 新闻分类的父Code
	 * default:默认分类
	 * channel:频道
	 */
	
	public String parent_category_code = "default";
	
	
	public boolean is_channel = false; 
	
	
	public Timestamp create_at = new Timestamp(System.currentTimeMillis());
	
	
	

}
