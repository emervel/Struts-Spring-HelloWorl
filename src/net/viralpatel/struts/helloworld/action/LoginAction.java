package net.viralpatel.struts.helloworld.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.viralpatel.struts.helloworld.business.BusinessDelegate;
import net.viralpatel.struts.helloworld.form.LoginForm;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {
	
	private BusinessDelegate businessDelegate;
	
	public BusinessDelegate getBusinessDeletage() {
		return businessDelegate;
	}

	public void setBusinessDelegate(BusinessDelegate businessDeletage) {
		this.businessDelegate = businessDeletage;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	
		String target = null;
		LoginForm loginForm = (LoginForm)form; 
		    
		target = businessDelegate.validateUser(loginForm.getUserName(), 
												loginForm.getPassword());
		
		return mapping.findForward(target);
	}
}
