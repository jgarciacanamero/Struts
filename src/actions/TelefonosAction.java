package actions;
import java.util.ArrayList;

import org.apache.struts.action.*;

import javax.servlet.http.*;

import javabean.*;
import BBDD.*;

import javax.servlet.http.*;

import org.apache.struts.action.*;

public class TelefonosAction  extends Action{
	
	private final static String SUCCESS="telefonoSeleccionado";
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse res){
		
		
		String driver= "com.mysql.jdbc.Driver";
		String cadenaCon= "jdbc:mysql://localhost:3306/practica9";
		datos dt= new datos(driver,cadenaCon);
		TelefonoForm tlf= (TelefonoForm) form;
		
		ArrayList<ListadoForm>list=dt.getList(tlf.getTelefono());
		req.setAttribute("list", list);
		
		
		
		return mapping.findForward(SUCCESS);
    }

}
