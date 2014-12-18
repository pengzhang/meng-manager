package controllers;

import models.AdminUser;
import play.mvc.Before;
import play.mvc.Controller;
import play.mvc.With;


@With(Secure.class)
@Check("admin")
public class Admin extends Controller {

	@Before
	static void setConnected(){
		if(Security.isConnected()){
			AdminUser user = AdminUser.find("byEmail", Security.connected()).first();
			renderArgs.put("user", user.fullname);
		}
	}
	
	public static void index(){
		render();
	}
	
	
}
