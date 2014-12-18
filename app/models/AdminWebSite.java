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
public class AdminWebSite extends Model {

	@Column
	public String aw_code = Codec.UUID();
	
	@Column
	public String admin_code;
	
	@Column
	public String web_site_code;
	
	

}
