package models;

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
public class Faq extends Model {

	
	public String code = Codec.UUID();
	
	public String question;
	@Lob
	public String answer;
	
	public String web_site_code;
	
	public boolean status = false;
	public Timestamp create_date = new Timestamp(System.currentTimeMillis());
	

}
