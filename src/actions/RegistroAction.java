package actions;

import org.apache.struts.action.*;
import javax.servlet.http.*;
import java.util.*;

import javabean.*;
import BBDD.*;

public class RegistroAction extends Action{
	
	private final static String SUCCESS="clienteRegistrado";
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String driver= "com.mysql.jdbc.Driver";
		String cadenaCon= "jdbc:mysql://localhost:3306/practica9";
		
		datos dt= new datos(driver,cadenaCon);
		RegistroForm registro= (RegistroForm) form;
		dt.registrarse(registro);
		
		return mapping.findForward(SUCCESS);
	}

}
