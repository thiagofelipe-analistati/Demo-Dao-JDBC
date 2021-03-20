package aplicacao;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {

		VendedorDao vendededorDao = DaoFactory.createVendedordao();

		Vendedor obj = vendededorDao.findById(8);
	
		System.out.println();
	
		System.out.println(obj);
 
	}

}
