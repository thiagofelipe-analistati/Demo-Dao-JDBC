package aplicacao;

import java.util.Date;

import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Departamento obj = new Departamento( 1, "Livros");
		Vendedor obj1 = new Vendedor(1, "Thiago", "fel_thiago@outlook.com", new Date(), 10000.0, obj);
		
		System.out.println();
	
		System.out.println(obj);

		System.out.println(obj1);


	}

}
