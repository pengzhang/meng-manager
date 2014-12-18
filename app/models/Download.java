package models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class Download extends Model {

	
	public String soft_code = Codec.UUID();
	
	public String soft_name;
	
	public String soft_author;
	@Lob
	public String soft_desc;
	
	public String soft_size;
	
	public String soft_lang; // 英文,中文
	
	public String soft_sys; //windows,linux
	
	public String soft_ver; //版本
	
	public String soft_type;//免费,收费
	
	public String soft_url;
	
	public boolean soft_status = false; //审核通过
	
	public String down_category_code;
	
	public Date update_date;
	
	public Timestamp create_date = new Timestamp(System.currentTimeMillis());
	

}
