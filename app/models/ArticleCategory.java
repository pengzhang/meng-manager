package models;

import java.sql.Timestamp;

import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;

/**
 * 文章分类管理
 * @author zhangpeng
 *
 */

@Entity
public class ArticleCategory extends Model{
	
	/**
	 * 文章分类Code
	 */
	
	@Required
	public String category_code;
	
	/**
	 * 文章分类标题
	 */
	
	@Required
	public String category_title;
	
	/**
	 * 文章分类的父Code
	 * default:默认分类
	 * channel:频道
	 */
	
	public String parent_category_code = "default";
	
	
	public String web_site_code;
	
	
	public boolean is_channel = false; 
	
	
	public Timestamp create_at = new Timestamp(System.currentTimeMillis());

}
