package BBDD;
import actions.*;
import javabean.*;

import java.util.*;
import java.sql.*;


public class datos {
	
	private String driver;
	private String cadenaCon;
	
	public datos(String driver, String cadenaCon){
		this.driver=driver;
		this.cadenaCon=cadenaCon;
	}

	
	public Connection obtenerConexion(){
		
		Connection cn= null;
		
		try{
			Class.forName(driver);
			cn=DriverManager.getConnection(cadenaCon,"root","iniesta");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return cn;
		
	}
	
	public void registrarse(RegistroForm r){
		
		Connection cn;
		Statement st;
		
		try{
			cn=obtenerConexion();
			st=cn.createStatement();
			String sql= "Insert INTO CLIENTES values('";
			sql+= r.getNombre()+"','"+
				  r.getApellido()+"','"+
				  r.getUsuario()+"','"+
				  r.getPassword()+"','"+
				  r.getEmail()+"')";
			
			st.execute(sql);
			cn.close();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String login(LoginForm f){
		Connection cn;
		PreparedStatement st;
		String contraseña;
		try{
			
			cn=obtenerConexion();
			String sql="SELECT usuario, password FROM CLIENTES WHERE usuario=? AND password=?";
			st=cn.prepareStatement(sql);
			
			st.setString(1,f.getNomUsuario());
			st.setString(2,f.getPass());
			ResultSet rs = st.executeQuery();
			
			while(rs.next()){
				
				contraseña=rs.getString("password");
				
				return contraseña;
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList <TelefonoForm> getTelefono(String pass){
		
		Connection cn;
		PreparedStatement st;
		ResultSet rs;
		ArrayList <TelefonoForm> numTel= new ArrayList <TelefonoForm>();
		
		try{
		cn=obtenerConexion();
		String sql="SELECT telefono FROM TELEFONOS WHERE password='"+pass+"'";
		st=cn.prepareStatement(sql);
		
		 rs = st.executeQuery();
		 //numTel= new ArrayList <TelefonoForm>();
		
		while(rs.next()){
			
			TelefonoForm t= new TelefonoForm(rs.getInt("telefono"));
			numTel.add(t);
			
			return numTel;
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
	public ArrayList<ListadoForm> getList(int telefono){
		
		Connection cn=null;
		ArrayList<ListadoForm> lista= null;
		Statement st;
		ResultSet rs;
		
		try{
			cn=obtenerConexion();
			st=cn.createStatement();
			String sql;
			sql="SELECT * from LLAMADAS WHERE telefono='"+telefono+"'";
			rs= st.executeQuery(sql);
			lista= new ArrayList <ListadoForm>();
			
			while(rs.next()){
				ListadoForm l= new ListadoForm(rs.getInt("idllamada"),rs.getInt("telefono"),rs.getInt("destino"),rs.getInt("duracion"),rs.getInt("idtipotarifa"),rs.getString("coste"));
				
				lista.add(l);
			}
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return lista;
	}
}
