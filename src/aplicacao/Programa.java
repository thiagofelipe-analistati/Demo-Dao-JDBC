package aplicacao;


import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teste 1: Pesquisa pelo ID do vendedor: ");
		VendedorDao vendededorDao = DaoFactory.createVendedordao();
		Vendedor obj = vendededorDao.findById(9);
		System.out.println(obj);
	}
		/*
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

		System.out.println("Teste 4: insert Vendedor: ");
		Vendedor novoVendedor = new Vendedor(null, "matheus", "matheusviad_@arromabdno", new java.util.Date(), 4000.0, departametno);
		vendededorDao.insert(novoVendedor);
		
		System.out.println("Teste 5: update Vendedor: ");
		obj = vendededorDao.findById(1);
		obj.setNome("thiago");
		vendededorDao.update(obj);
		System.out.println("Alteração completa: "+ obj); 
		System.out.println("Teste 6: delete Vendedor: ");
		System.out.println("Digite o id que deseja delaetar: ");
		int id = sc.nextInt();
		vendededorDao.deleteById(id);
		System.out.println("Delete completo ");
		sc.close();
	}
	
	*/

}
