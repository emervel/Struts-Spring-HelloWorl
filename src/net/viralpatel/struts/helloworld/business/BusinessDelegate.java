package net.viralpatel.struts.helloworld.business;

public class BusinessDelegate {
	
	public String validateUser(String userName, String password) {
		if(userName.equals("admin") && password.equals("123")) {
			return "success";
		}
		
		return "failure";
	}
}
