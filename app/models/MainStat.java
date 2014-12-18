package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import play.db.jpa.Model;

@Entity
public class MainStat extends Model{

	public long administrator = 0;
	public long user = 0;
	public long article = 0;
	public long news = 0;
	public long image = 0;
	public long download = 0;
	public long message = 0;
	public long exam = 0;
	public long question = 0;
	public long domain = 0;
	public long advertising = 0;
	public long faq = 0;
	
	@Transient
	public final static String ADMINISTRATOR = "administrator";
	@Transient
	public final static String USER = "user";
	@Transient
	public final static String ARTICLE = "article";
	@Transient
	public final static String NEWS = "news";
	@Transient
	public final static String IMAGE = "image";
	@Transient
	public final static String DOWNLOAD = "download";
	@Transient
	public final static String MESSAGE = "message";
	@Transient
	public final static String EXAM = "exam";
	@Transient
	public final static String QUESTION = "question";
	@Transient
	public final static String DOMAIN = "domain";
	@Transient
	public final static String ADVERTISING = "advertising";
	@Transient
	public final static String FAQ = "faq";
	

}
