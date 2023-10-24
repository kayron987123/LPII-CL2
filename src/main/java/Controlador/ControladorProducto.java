package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ClassCrudProductoImp;
import modelo.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("RegistrarProducto").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nombre = request.getParameter("nombre");
		double precio = Double.parseDouble(request.getParameter("precio"));
		double precioven = Double.parseDouble(request.getParameter("precioven"));
		String estado = request.getParameter("estado");
		String descrip = request.getParameter("descrip");
		
		TblProductocl2 prodcl2 = new TblProductocl2();
		ClassCrudProductoImp crud = new ClassCrudProductoImp();
		
		prodcl2.setNombrecl2(nombre);
		prodcl2.setPreciocompcl2(precio);
		prodcl2.setPrecioventacl2(precioven);
		prodcl2.setEstadiocl2(estado);
		prodcl2.setDescripcl2(descrip);
		
		crud.RegistrarProducto(prodcl2);
		
		List<TblProductocl2> listaprod = crud.Listaproducto();
		
		request.setAttribute("listado", listaprod);
		
		request.getRequestDispatcher("/RegistrarProducto.jsp").forward(request, response);
		
	}

}
