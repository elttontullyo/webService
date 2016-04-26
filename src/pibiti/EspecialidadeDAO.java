package pibiti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class EspecialidadeDAO {
	
	public boolean inserirEspecialidade(Especialidade especialidade){
		
		try {
			Connection connection = ConectaMysql.obtemConexao();
			String querry = "INSERT INTO especialidade VALUES (null,?,?)";
			PreparedStatement statement = connection.prepareStatement(querry);
			
			statement.setString(1, especialidade.getEspecialidade());
			statement.setString(2, especialidade.getPosicao());
			statement.executeUpdate();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	public boolean excluirEspecialidade(Especialidade especialidade){
		
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "DELETE FROM especialidade WHERE id = ?";
			PreparedStatement statement = conexao.prepareStatement(querry);
			
			statement.setInt(1, especialidade.getId());
			statement.executeUpdate();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	
	
	
	public boolean updateEspecialidade(Especialidade especialidade){
		
		try {
			Connection connection = ConectaMysql.obtemConexao();
			String querry = "UPDATE especialidade set especialidade = ?, posicao = ?"
					+ "WHERE id = ?";
			PreparedStatement statement = connection.prepareStatement(querry);
			
			statement.setString(1, especialidade.getEspecialidade());
			statement.setString(2, especialidade.getPosicao());
			statement.setInt(3, especialidade.getId());
			statement.executeUpdate();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	public ArrayList<Especialidade> buscarTodasEspecialidade(){
		
		ArrayList<Especialidade> lista = new ArrayList<Especialidade>();
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "SELECT * FROM especialidade";
			PreparedStatement statement = conexao.prepareStatement(querry);
			ResultSet resultSet= statement.executeQuery();
			
			while(resultSet.next()){
				Especialidade especialidade= new Especialidade();
				especialidade.setId(resultSet.getInt(1));
				especialidade.setEspecialidade(resultSet.getString(2));
				especialidade.setPosicao(resultSet.getString(3));
				lista.add(especialidade);
				
			}
			statement.execute();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public Especialidade buscarPorId(int id){
		
		Especialidade especialidade = null;
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "SELECT * FROM especialidade WHERE id = ?";
			PreparedStatement statement = conexao.prepareStatement(querry);
			
			statement.setInt(1,id);
			ResultSet resultSet= statement.executeQuery();
			
			if(resultSet.next()){
				especialidade= new Especialidade();
				especialidade.setId(resultSet.getInt(1));
				especialidade.setEspecialidade(resultSet.getString(2));
				especialidade.setPosicao(resultSet.getString(3));
				
			}else{
				return especialidade;
			}
			statement.execute();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return especialidade;
	}
	
	public ArrayList<Especialidade> buscarPorEspecialidade(String especialidades){
		
		ArrayList<Especialidade> lista = new ArrayList<Especialidade>();
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "SELECT * FROM especialidade WHERE especialidade LIKE ?";
			PreparedStatement statement = conexao.prepareStatement(querry);
			statement.setString(1, "%"+especialidades+"%");
			ResultSet resultSet= statement.executeQuery();
			
			while(resultSet.next()){
				Especialidade especialidade= new Especialidade();
				especialidade.setId(resultSet.getInt(1));
				especialidade.setEspecialidade(resultSet.getString(2));
				especialidade.setPosicao(resultSet.getString(3));
				lista.add(especialidade);
				
			}
			statement.execute();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	

}
