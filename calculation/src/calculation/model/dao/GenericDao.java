package calculation.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GenericDao {
	
	
	
	public void save(String insertSQL, Object... parametros) {
	    Connection con = null;
	    try {
	        String url = "jdbc:mysql://localhost:3306/calc";
	        String usuario = "root";
	        String senha = "161009";

	        con = DriverManager.getConnection(url, usuario, senha);
	        PreparedStatement ps = con.prepareStatement(insertSQL);

	        for (int i = 0; i < parametros.length; i++) {
	            ps.setObject(i + 1, parametros[i]);
	        }

	        ps.execute();
	        ps.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (con != null) {
	                con.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	
}

