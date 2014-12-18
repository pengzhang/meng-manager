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
public class Exam extends Model {

	
	public String e_code = Codec.UUID();
	
	public String exam_name;
	
	public String exam_desc;
	
	public boolean exam_status = false;
	
	public String exam_author;
	
	public String web_site_code;
	public Timestamp create_date = new Timestamp(System.currentTimeMillis());
	
	

}
