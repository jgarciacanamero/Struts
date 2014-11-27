package javabean;


import org.apache.struts.action.*;

public class TelefonoForm extends ActionForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Integer telefono;
	
	public TelefonoForm(){}
	
	public TelefonoForm(Integer telefono){
		
		this.telefono= telefono;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	
	

}