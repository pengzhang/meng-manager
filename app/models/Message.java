package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class Message extends Model{

	
	public String msg_code = Codec.UUID();
	
	public String name;
	
	public String email;
	
	public String mobile;
	
	public String message;
	
	public String web_site_code;
	
	public boolean status = false;
	
	public Timestamp create_date = new Timestamp(System.currentTimeMillis());	
	

}
