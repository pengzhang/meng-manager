package models;

import java.sql.Timestamp;

import javax.persistence.Entity;

import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class DownloadCategory  extends Model{

	
	public String dc_code = Codec.UUID();
	
	public String dc_name;
	
	public String dc_desc;
	
	public String parent_dc_code;
	
	public String web_site_code;
	
	public Timestamp create_date = new Timestamp(System.currentTimeMillis());;
	
	
}
