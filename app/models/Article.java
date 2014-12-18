package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import play.data.validation.Required;
import play.db.jpa.Model;

/**
 * 文章管理
 * @author zhangpeng
 *
 */
@Entity
public class Article extends Model {

	/**
	 * 文章Code
	 */
	
	@Required
	public String article_code;
	
	/**
	 * 文章标题
	 */
	
	@Required
	public String article_title;
	
	/**
	 * 文章内容
	 */
	@Lob
	public String article_content;
	
	/**
	 * 文章作者
	 */
	
	public String article_author;
	
	/**
	 * 文章添加时间
	 */
	
	@Required
	public Timestamp article_date = new Timestamp(System.currentTimeMillis());
	
	/**
	 * 文章主题
	 */
	
	public String article_subject;
	
	/**
	 * 文章分类
	 * default:默认分类
	 */
	
	public String article_category_code;
	
	/**
	 * 审核状态
	 * 默认:不通过
	 */
	
	public boolean article_auditstatus=false;
	
}
