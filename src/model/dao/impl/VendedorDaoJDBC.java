package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class VendedorDaoJDBC implements VendedorDao{
	// atribto de conexão
	private Connection conn;
	
	// injeção de depedências 
	public VendedorDaoJDBC (Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Vendedor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Vendedor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vendedor findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT vendedor.*,departamento.Name as DepName "
					+ "FROM vendedor INNER JOIN departamento "
					+ "ON vendedor.DepartmentId = departamento.Id "
					+ "WHERE vendedor.Id = ?");

			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Departamento dep = instanciacacaoDepartamento(rs);
				Vendedor obj = instanciacacaoVendedor(rs, dep);
				return obj;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		}
	

	private Vendedor instanciacacaoVendedor(ResultSet rs, Departamento dep) throws SQLException {
		Vendedor obj = new Vendedor();
		obj.setId(rs.getInt("Id"));
		obj.setNome(rs.getString("Name"));
		obj.setEmail(rs.getString("Email"));
		obj.setSalarioBase(rs.getDouble("BaseSalary"));
		obj.setDataNasc(rs.getDate("BirthDate"));  
		obj.setDepartamento(dep);
		return obj;
	}

	private Departamento instanciacacaoDepartamento(ResultSet rs) throws SQLException {
		Departamento dep =new Departamento();
		dep.setId(rs.getInt("DepartmentId"));
		dep.setNome(rs.getString("DepName"));
		return null;
	}

	@Override
	public List<Vendedor> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
