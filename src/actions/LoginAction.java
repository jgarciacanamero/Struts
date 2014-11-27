package actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javabean.*;
import BBDD.*;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForward;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
    	ArrayList<TelefonoForm> tel= new ArrayList<TelefonoForm>();
    	
    	String driver= "com.mysql.jdbc.Driver";
		String cadenaCon= "jdbc:mysql://localhost:3306/practica9";
		
		datos dt= new datos(driver,cadenaCon);
		LoginForm log= (LoginForm) form;
		String pass=dt.login(log);
		
		tel=dt.getTelefono(pass);
		req.setAttribute("tel", tel);
    
	    if(pass!=null){   	
	    	return mapping.findForward("opciones");
	    }else{
	    	return mapping.findForward("failure");
	    }
 }
}
