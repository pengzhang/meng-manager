package models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import play.db.jpa.Model;

/**
 * 广告管理
 * @author zhangpeng
 *
 */
@Entity
public class Advertising extends Model{
	
	
	/**
	 * 广告Code
	 */
	
	public String ad_code;
	
	
	public String ad_name;
	
	/**
	 * 广告位置
	 */
	
	public String ad_position;
	
	/**
	 * 广告脚本
	 */
	
	public String ad_script;
	
	/**
	 * 广告链接URL
	 */
	
	public String ad_url;
	
	/**
	 * 广告图片
	 */
	
	public String ad_image;
	
	/**
	 * 广告文字
	 */
	
	public String ad_text;
	
	/**
	 * 广告类型
	 * IMAGE:图片广告
	 * TEXT:文字广告
	 * IMAGE_TEXT:图文广告
	 * OTHER:广告商广告
	 */
	
	public String ad_type;
	
	/**
	 * 广告上架
	 */
	
	public boolean online=false;
	
	/**
	 * 隶属网站
	 */
	
	public String web_site_code;
	
	/**
	 * 广告到期日期
	 */
	public Date endate;
	
	public Timestamp create_date = new Timestamp(System.currentTimeMillis());
	
}
