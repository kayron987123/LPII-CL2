package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuariable;
import modelo.TblUsuariocl2;

public class ClassCrudUsuarioImp implements IUsuariable{

	@Override
	public void InsertarUsuario(TblUsuariocl2 usucl2) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("LPII-CL2");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(usucl2);
		em.getTransaction().commit();
		em.close();
		
	}

}
