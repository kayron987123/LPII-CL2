package TestEntidad;

import java.util.List;

import Dao.ClassCrudProductoImp;
import modelo.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		TblProductocl2 prodcl2 = new TblProductocl2();
		ClassCrudProductoImp crud = new ClassCrudProductoImp();
		
		/*
		prodcl2.setNombrecl2("Yogurt ");
		prodcl2.setPrecioventacl2(7.5);
		prodcl2.setPreciocompcl2(8.5);
		prodcl2.setEstadiocl2("Vigente");
		prodcl2.setDescripcl2("Oferta");
		
		crud.RegistrarProducto(prodcl2);
		
		*/
		
		List<TblProductocl2> listaprod = crud.Listaproducto();
		
		for(TblProductocl2 list: listaprod){
			System.out.println(list.getIdproductocl2() + " " + list.getNombrecl2() + " " + list.getPrecioventacl2() + " " + 
								list.getPreciocompcl2() + " " + list.getEstadiocl2() + " " + list.getDescripcl2());
		}
	}

}
