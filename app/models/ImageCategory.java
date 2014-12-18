package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class ImageCategory extends Model {

	
	public String ic_code = Codec.UUID();
	
	
	public String category_name;
	
	
	public String category_desc;
	
	
	public String web_site_code;
	
	
	public String parent_category_code = "default";
	
	
	public boolean is_channel = false; 
	
	
	public Timestamp create_at = new Timestamp(System.currentTimeMillis());
	

}
