<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"  %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"  %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"  %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listado</title>
</head>
<body>
 	<center>
 		<h1>Listado de Llamadas</h1>
 		<table border="1">
 			<tr>
 				<th>Identificador Llamada</th>
 				<th>Telefono</th>
 				<th>Codigo Destino</th>
 				<th>Duracion</th>
 				<th>Identificador tarifa</th>
 				<th>Coste</th>
 				
 			</tr>
 			
 		<logic:iterate id="listado" name="list" scope="request" type="javabean.ListadoForm">
 			<tr>
 				<td><bean:write name="listado" property="idllamada"/></td>
 				<td><bean:write name="listado" property="telefono"/></td>
 				<td><bean:write name="listado" property="destino"/></td>
 				<td><bean:write name="listado" property="duracion"/></td>
 				<td><bean:write name="listado" property="idtipotarifa"/></td>
 				<td><bean:write name="listado" property="coste"/></td>
 				
 			</tr>
 					
 		</logic:iterate>
 		</table>
 	</center>
</body>
</html>