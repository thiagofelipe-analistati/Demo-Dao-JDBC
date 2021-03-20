package aplicacao;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		
		System.out.println("Teste 1: Pesquisa pelo ID do vendedor: ");
		VendedorDao vendededorDao = DaoFactory.createVendedordao();
		Vendedor obj = vendededorDao.findById(8);
		System.out.println(obj);
		System.out.println("Teste 2: Pesquisa pelo ID do departamento: ");
		Departamento departametno = new Departamento(2,null);
		List<Vendedor> list = vendededorDao.FindByDepartamento(departametno);
		for (Vendedor obj1: list) {
			System.out.println(obj1);
		}
		System.out.println("Teste 3: Pesquisa pelo ID do todos departamento e vendedores: ");
		list = vendededorDao.FindAll();
		for (Vendedor obj1: list) {
			System.out.println(obj1);
		}
		
	}

}
