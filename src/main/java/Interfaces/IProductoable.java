package Interfaces;

import java.util.List;

import modelo.TblProductocl2;

public interface IProductoable {
	public void RegistrarProducto(TblProductocl2 prodcl2);
	List<TblProductocl2> Listaproducto();
}
