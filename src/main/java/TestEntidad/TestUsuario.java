package TestEntidad;

import Dao.ClassCrudUsuarioImp;
import modelo.TblUsuariocl2;

public class TestUsuario {

	public static void main(String[] args) {
		
		TblUsuariocl2 usucl2 = new TblUsuariocl2();
		ClassCrudUsuarioImp crud = new ClassCrudUsuarioImp();
		/*
		usucl2.setIdusuariocl2(1);
		usucl2.setUsuariocl2("admin");
		usucl2.setPasswordcl2("123456");
		crud.InsertarUsuario(usucl2);
		
		System.out.println("Dato ingresado");
		*/
		
		usucl2.setIdusuariocl2(1);
		TblUsuariocl2 usu = crud.BuscarUsuario(usucl2);
		
		System.out.println(usu.getIdusuariocl2() + " " + usu.getUsuariocl2() + " " +usu.getPasswordcl2());
		
	}

}
