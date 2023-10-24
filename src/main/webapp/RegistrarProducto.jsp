<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.*" %>
	<%@page import="modelo.TblProductocl2" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gestion Productos</title>
</head>
<body bgcolor="#c5dec9">

<form action="ControladorProducto" method="post">

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

<%
String men=(String)request.getAttribute("mensaje");
String menreg="";
//aplicamos condicion
if(men != null)  menreg=men;
%>
<h2 align="center" style="color:blue;">
<%=menreg%>
</h2>

<!-- ----------------------------------------------------------------------------------------- -->

<h1 align="center">Listado de Autos</h1>

<table align="center" border="2">

<tr>
<th>Codigo</th>
<th>Nombre</th>
<th>PV</th>
<th>PC</th>
<th>Estado</th>
<th>Descripcion</th>
</tr>

<%
List<TblProductocl2> ListadoProducto=(List<TblProductocl2>)request.getAttribute("listado");
if(ListadoProducto != null){
	for(TblProductocl2 lis:ListadoProducto){
%>

<tr>

<td>
<%=lis.getIdproductocl2()%>
</td>

<td>
<%=lis.getNombrecl2()%>
</td>

<td>
<%=lis.getPrecioventacl2()%>
</td>

<td>
<%=lis.getPreciocompcl2()%>
</td>

<td>
<%=lis.getEstadiocl2()%>
</td>

<td>
<%=lis.getDescripcl2()%>
</td>

</tr>

<%
	}
}
%>

</table>

</body>
</html>