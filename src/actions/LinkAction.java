package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;
import javabean.*;
import BBDD.*;


public class LinkAction extends org.apache.struts.action.Action{
	
	
		 
		public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	        
			
	        
			return mapping.findForward("success");
		    
		}
}
