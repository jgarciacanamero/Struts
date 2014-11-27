<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"  %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"  %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"  %>
<%@ page import="java.util.*, actions.*, BBDD.*, javabean.*, java.sql.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgColor="lightYellow">
	
	<center>
	<h1>Listado de teléfonos del usuario </h1><br><br>
		
	  	 	<html:form action="opciones.do">
            <html:select property="telefono" >
                <html:option value="">–SELECT–</html:option>
                <html:options collection="tel" property="telefono" />
            </html:select> 
        
		
		<html:submit property="submit" value="Llamadas"></html:submit>
	</html:form>
	
	</center>	

</body>
</html>