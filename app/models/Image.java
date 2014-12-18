package models;

import java.io.File;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import play.db.jpa.Model;

/**
 * 图片管理
 * @author zhangpeng
 *
 */
@Entity
public class Image extends Model{

	/**
	 * 图片Code
	 */
	
	public String img_code;
	
	
	public String image_name;
	
	
	public String image_desc;
	
	/**
	 * 图片URL
	 * 网络图片
	 */
	
	public String image_url;
	/**
	 * 图片的字节码
	 * 用于存储上传图片
	 */
	@Transient
	public File image_file;
	
	public String image_file_name;
	/**
	 * 图片存放的路径
	 * 用于存储上传图片的服务器路径
	 */
	
	public String image_path;
	
	/**
	 * 图片类型
	 * URL:网络图片
	 * UPLOAD:自行上传图片
	 */
	
	public String image_type;
	
	/**
	 * 所属图片分类的Code
	 */
	
	public String category_code;
	
	/**
	 * 所属文章的Code
	 */
	
	public String article_code;
	
	
	public boolean image_status = false;
	
	
	public Timestamp create_date = new Timestamp(System.currentTimeMillis());
	
	
}
