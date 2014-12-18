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
 * 新闻管理
 * @author zhangpeng
 *
 */
@Entity
public class News extends Model {

	
	/**
	 * 新闻Code
	 */
	
	@Required
	public String news_code;
	
	/**
	 * 新闻标题
	 */
	
	@Required
	public String news_title;
	
	/**
	 * 新闻内容
	 */
	@Lob
	public String news_content;
	
	/**
	 * 新闻作者
	 */
	
	public String news_author;
	
	/**
	 * 新闻添加时间
	 */
	
	@Required
	public Timestamp news_date = new Timestamp(System.currentTimeMillis());
	
	/**
	 * 新闻主题
	 */
	
	public String news_subject;
	
	/**
	 * 新闻分类
	 * default:默认分类
	 */
	
	public String news_category_code;
	
	/**
	 * 审核状态
	 * 默认:不通过
	 */
	
	public boolean news_auditstatus=false;
	
	
}
