package javabean;

import java.sql.Date;

import org.apache.struts.action.ActionForm;

public class ListadoForm extends ActionForm{
	
	private int idllamada,telefono, destino, duracion, idtipotarifa;
	private String coste;
	private Date fecha;
	


	public ListadoForm(int idllamada, int telefono, int destino, int duracion,
			int idtipotarifa, String coste) {
		super();
		this.idllamada = idllamada;
		this.telefono = telefono;
		this.destino = destino;
		this.duracion = duracion;
		this.idtipotarifa = idtipotarifa;
		this.coste = coste;
		//this.fecha = fecha;
	}



	public int getidllamada() {
		return idllamada;
	}



	public void setidllamada(int idllamada) {
		this.idllamada = idllamada;
	}



	public int getTelefono() {
		return telefono;
	}



	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	public int getDestino() {
		return destino;
	}



	public void setDestino(int destino) {
		this.destino = destino;
	}



	public int getDuracion() {
		return duracion;
	}



	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}



	public int getidtipotarifa() {
		return idtipotarifa;
	}



	public void setidtipotarifa(int idtipotarifa) {
		this.idtipotarifa = idtipotarifa;
	}



	public String getCoste() {
		return coste;
	}



	public void setCoste(String coste) {
		this.coste = coste;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	
	
	
}
