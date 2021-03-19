package aplicacao;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Departamento obj = new Departamento( 1, "Livros");
		Vendedor obj1 = new Vendedor(1, "Thiago", "fel_thiago@outlook.com", new Date(), 10000.0, obj);
		
		
		VendedorDao vendededorDao = DaoFactory.createVendedordao();
		System.out.println();
	
		System.out.println(obj);

		System.out.println(obj1);


	}

}
