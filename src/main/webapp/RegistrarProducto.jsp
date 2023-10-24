<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="ControladorServlet" method="post">

<table align="center">

<tr>
<td>Nombre</td>
<td><input type="text" name="nombre"></td>
</tr>

<tr>
<td>Precio</td>
<td><input type="text" name="precio"></td>
</tr>

<tr>
<td>PrecioVen</td>
<td><input type="text" name="precioven"></td>
</tr>

<tr>
<td>Estado</td>
<td><input type="text" name="estado"></td>
</tr>

<tr>
<td>Descrip</td>
<td><input type="text" name="descrip"></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="Registrar"></td>
</tr>

</table>

</form>

<!-- ----------------------------------------------------------------------------------------- -->

<h1 align="center">Listado de Autos</h1>

</body>
</html>