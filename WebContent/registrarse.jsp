<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro</title>
</head>
<body bgColor="lightYellow">
	<center>
	
		<h1>Registro de usuarios</h1><br><br>
		<html:form action="registro.do">
			Nombre:<html:text property="nombre"></html:text><br>
			Apellido:<html:text property="apellido"></html:text><br>
			Usuario:<html:text property="usuario"></html:text><br>
			Password:<html:text property="password"></html:text><br>
			Email:<html:text property="email"></html:text><br>
			
			<html:submit property="submit" value="Registrese"></html:submit>
	
		</html:form>
	
	
	</center>	
	

</body>
</html>