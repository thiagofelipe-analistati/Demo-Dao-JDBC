package model.dao;

import db.DB;
import model.dao.impl.VendedorDaoJDBC;

public class DaoFactory {
	public static VendedorDao createVendedordao() {
		return new VendedorDaoJDBC(DB.getConnection());
	}
}
