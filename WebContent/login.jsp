<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
  
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"  %>

  
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Login Page</title>  
  
<head >  
 </head>  
<body bgColor="lightYellow"> 
	<center>
		<h1>Formulario de autentificación</h1> <br><br>
			
        <html:form action="login.do" method="post">
            <!-- 	Username:<html:text  property="nomUsuario"></html:text><br>
            	
                Password:<html:password  property="pass"></html:password><br>
                -->
                
                Username:<input type="text" name="nomUsuario"/>
                Password:<input type="password" name="pass">
                
                <html:submit property="submit" value="login" ></html:submit>
        </html:form>
        <br><br><br>
        <html:link page="/registrarse.jsp" paramId="id" >Regístrese</html:link>
	
 	</center> 
</body>  
</html> 