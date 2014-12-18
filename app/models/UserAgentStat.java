package models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class UserAgentStat extends Model{

	public String code = Codec.UUID();
	public String brower;
	public String brower_version;
	public String platform;
	public Timestamp create_date = new Timestamp(System.currentTimeMillis());


}
