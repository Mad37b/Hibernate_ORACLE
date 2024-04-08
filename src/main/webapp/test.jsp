<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="java.sql.*"  %>
<%@page import="com.iesVda.persistence.*"  %>


<html>
<head>
<meta charset="UTF-8">
<title>testJSP</title>
</head>
<body>

<!--  Conectar con la base de datos -->

<%employeeDao EmployeeDao = new employeeDao(); 
employees employeeJSP = new employees();%>

<h2> texto de prueba</h2>

<!--  Buscar empleado por id -->

<% employeeDao.getEmployeeById(employeeJSP); 




%>


</body>
</html>