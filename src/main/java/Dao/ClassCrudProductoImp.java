package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProductoable;
import modelo.TblProductocl2;

public class ClassCrudProductoImp implements IProductoable{

	@Override
	public void RegistrarProducto(TblProductocl2 prodcl2) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII-CL2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(prodcl2);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<TblProductocl2> Listaproducto() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII-CL2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();		
		List<TblProductocl2> listaProducto = em.createQuery("select t from TblProductocl2 t", TblProductocl2.class).getResultList();
		em.getTransaction().commit();
		em.close();
		
		return listaProducto;
	}

}
