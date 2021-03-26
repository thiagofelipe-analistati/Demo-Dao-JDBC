package aplicacao;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartamentoDao;
import model.entidades.Departamento;

public class Programadepartamento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartamentoDao departamentoDao = DaoFactory.createDepartamentoDao();
		List<Departamento> list = new ArrayList<>();
	
		System.out.println("Teste 1: Pesquisa pelo ID do departamento: ");
		//VendedorDao vendededorDao = DaoFactory.createVendedordao();
		Departamento obj = departamentoDao.findById(1);
		System.out.println(obj);
		
		System.out.println("Teste 2: Pesquisa de todos os departamentos: ");
		list = departamentoDao.FindAll();
		for (Departamento obj1: list) {
			System.out.println(obj1);
		}

		
		System.out.println("Teste : insert Departametno: ");
		Departamento novoDepartamentor = new Departamento(null, "Softwares");
		departamentoDao.insert(novoDepartamentor);	
		System.out.println(novoDepartamentor);
		
		System.out.println("Teste : delete departamento: ");
		System.out.println("Digite o id que deseja delaetar: ");
		int id = sc.nextInt();
		departamentoDao.deleteById(id);
		System.out.println("Delete completo ");
		sc.close();
		
		System.out.println("Teste 5: update Departamento: ");
		Departamento dep1 = departamentoDao.findById(1);
		dep1.setNome("TI");
		departamentoDao.update(dep1);
		System.out.println("Alteração completa: "+ dep1); 
		
	
	}
	
	

}
