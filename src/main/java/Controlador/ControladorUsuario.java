package Controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.TblUsuariocl2;



/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII-CL2");
		EntityManager em = emf.createEntityManager();
		
		Query consulta = em.createQuery("select u from TblUsuariocl2 u where u.usuariocl2=:x and u.passwordcl2=:y",TblUsuariocl2.class);
		
		consulta.setParameter("x", usuario);
		consulta.setParameter("y", password);
		
		TblUsuariocl2 u = null;
		
		try {
	        u = (TblUsuariocl2) consulta.getSingleResult();
	    } catch (Exception e) {
	        u = null;
	    }
		
		if(u != null){
			request.getRequestDispatcher("RegistrarProducto.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("IngresoSistema.jsp").forward(request, response);
		}	
	}
}
