package javabean;


import org.apache.struts.action.ActionForm;
import javax.servlet.http.*;
import org.apache.struts.action.*;
import actions.*;
import BBDD.*;


public class LoginForm extends ActionForm{
    
	private static final long serialVersionUID = 1L;
	private String nomUsuario;
    private String pass;
    
    public LoginForm(){};
   
    public LoginForm(String nomUsuario, String pass){
    	
    	this.nomUsuario=nomUsuario;
    	this.pass=pass;
    }

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
    
    
 
    
}