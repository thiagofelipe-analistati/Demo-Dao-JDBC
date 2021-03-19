package model.dao;

import model.dao.impl.VendedorDaoJDBC;

public class DaoFactory {
	public static VendedorDao createVendedordao() {
		return new VendedorDaoJDBC();
	}
}
