package aplicacao;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		
		System.out.println("Teste 1: Pesquisa pelo ID do vendedor: ");
		VendedorDao vendededorDao = DaoFactory.createVendedordao();
		Vendedor obj = vendededorDao.findById(8);
		System.out.println(obj);
 
	}

}
