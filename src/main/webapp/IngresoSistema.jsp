<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ingreso al Sistema</title>
</head>
<body bgcolor="#c5dec9">

<h1 align="center">Ingreso al sistema</h1>

<form action="ControladorUsuario" method="post">

<table align="center">

<tr>
<td>Usuario</td>
<td><input type="text" name="usuario"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="Ingresar"></td>
</tr>

</table>

</form>


</body>
</html>