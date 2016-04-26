package pibiti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ImageDAO {

	
	public boolean inserirEspecialidade(Image image){
		
		try {
			Connection connection = ConectaMysql.obtemConexao();
			String querry = "INSERT INTO image VALUES (null,?)";
			PreparedStatement statement = connection.prepareStatement(querry);
			
			statement.setBytes(1, image.getImagem());
			statement.executeUpdate();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
}
