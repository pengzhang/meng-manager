package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class DownloadUrl extends Model{
	
	public String soft_code;
	
	public String dl_url_code = Codec.UUID();
	
	public String soft_down_site; //多特,天空
	
	public String soft_url;
	

}
