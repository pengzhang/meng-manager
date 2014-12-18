package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class WebSite extends Model {

	
	public String web_code = Codec.UUID();
	
	public String web_name;
	
	public String web_url;
	
	public String domain = "localhost";
	
	public String web_desc;
	public Timestamp create_date;
	
	

}
