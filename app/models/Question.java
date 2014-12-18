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
public class Question extends Model{
	
	public String q_code = Codec.UUID();
	
	public String qtitle;
	
	public String qoptionA;
	
	public String qoptionB;
	
	public String qoptionC;
	
	public String qoptionD;
	
	public String qright;
	
	public String exam_code;
	
	public boolean status = false;
	public Timestamp create_date = new Timestamp(System.currentTimeMillis());
	

}
