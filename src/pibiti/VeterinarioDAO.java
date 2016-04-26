package pibiti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VeterinarioDAO {
	
	
	public boolean inserirVeterinario(Veterinario veterinario){
		
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "INSERT INTO veterinario VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = conexao.prepareStatement(querry);
			
			statement.setString(1, veterinario.getEmail());
			statement.setString(2, veterinario.getNomeEmpresa());
			statement.setString(3, veterinario.getDescricao());
			statement.setString(4, veterinario.getAtendimento());
			statement.setString(5, veterinario.getCep());
			statement.setString(6, veterinario.getEndereco());
			statement.setString(7, veterinario.getNumero());
			statement.setString(8, veterinario.getCidade());
			statement.setString(9, veterinario.getNomeVet());
			statement.setString(10, veterinario.getCpf());
			statement.setString(11, veterinario.getCelular());
			statement.setString(12, veterinario.getCrmv());
			statement.setString(13, veterinario.getEstado());
			statement.setString(14, veterinario.getBairro());
			statement.setBytes(15, veterinario.getImagem());
			statement.setString(16, veterinario.getCnpj());
			statement.executeUpdate();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean updateVeterinario(Veterinario veterinario){
		
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "UPDATE veterinario set email = ?, nomeEmpresa = ?,descricao = ?,atendimento = ?,"
					+ "cep = ?,endereco = ?,numero = ?,cidade = ?,nomeVet = ?, cnpj= ?, cpf = ?,"
					+ "celular = ?, crvm = ?, estado = ?, bairro = ? , image = ? where id = ?";
			PreparedStatement statement = conexao.prepareStatement(querry);
			
			statement.setString(1, veterinario.getEmail());
			statement.setString(2, veterinario.getNomeEmpresa());
			statement.setString(3, veterinario.getDescricao());
			statement.setString(4, veterinario.getAtendimento());
			statement.setString(5, veterinario.getCep());
			statement.setString(6, veterinario.getEndereco());
			statement.setString(7, veterinario.getNumero());
			statement.setString(8, veterinario.getCidade());
			statement.setString(9, veterinario.getNomeVet());
			statement.setString(10, veterinario.getCnpj());
			statement.setString(11, veterinario.getCpf());
			statement.setString(12, veterinario.getCelular());
			statement.setString(13, veterinario.getCrmv());
			statement.setString(14, veterinario.getEstado());
			statement.setString(15, veterinario.getBairro());
			statement.setBytes(16, veterinario.getImagem());
			statement.setInt(17, veterinario.getId());
			statement.executeUpdate();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean excluirVeterinario(Veterinario veterinario){
		
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "DELETE FROM veterinario WHERE id = ?";
			PreparedStatement statement = conexao.prepareStatement(querry);
			
			statement.setInt(1, veterinario.getId());
			statement.executeUpdate();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public ArrayList<Veterinario> buscarTodosVeteriarios(){
		
		ArrayList<Veterinario> lista = new ArrayList<Veterinario>();
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "SELECT * FROM veterinario";
			PreparedStatement statement = conexao.prepareStatement(querry);
			ResultSet resultSet= statement.executeQuery();
			
			while(resultSet.next()){
				Veterinario vet= new Veterinario();
				vet.setId(resultSet.getInt(1));
				vet.setEmail(resultSet.getString(2));
				vet.setNomeEmpresa(resultSet.getString(3));
				vet.setDescricao(resultSet.getString(4));
				vet.setAtendimento(resultSet.getString(5));
				vet.setCep(resultSet.getString(6));
				vet.setEndereco(resultSet.getString(7));
				vet.setNumero(resultSet.getString(8));
				vet.setCidade(resultSet.getString(9));
				vet.setNomeVet(resultSet.getString(10));
				vet.setCpf(resultSet.getString(11));
				vet.setCelular(resultSet.getString(12));
				vet.setCrmv(resultSet.getString(13));
				vet.setEstado(resultSet.getString(14));
				vet.setBairro(resultSet.getString(15));
				vet.setImagem(resultSet.getBytes(16));
				vet.setCnpj(resultSet.getString(17));
				lista.add(vet);
				
			}
			statement.execute();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}
	
	public Veterinario buscarPorId(int id){
		
		Veterinario vet = null;
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "SELECT * FROM veterinario WHERE id = ?";
			PreparedStatement statement = conexao.prepareStatement(querry);
			
			statement.setInt(1,id);
			ResultSet resultSet= statement.executeQuery();
			
			if(resultSet.next()){
				vet= new Veterinario();
				vet.setId(resultSet.getInt(1));
				vet.setEmail(resultSet.getString(2));
				vet.setNomeEmpresa(resultSet.getString(3));
				vet.setDescricao(resultSet.getString(4));
				vet.setAtendimento(resultSet.getString(5));
				vet.setCep(resultSet.getString(6));
				vet.setEndereco(resultSet.getString(7));
				vet.setNumero(resultSet.getString(8));
				vet.setCidade(resultSet.getString(9));
				vet.setNomeVet(resultSet.getString(10));
				vet.setCpf(resultSet.getString(11));
				vet.setCelular(resultSet.getString(12));
				vet.setCrmv(resultSet.getString(13));
				vet.setEstado(resultSet.getString(14));
				vet.setBairro(resultSet.getString(15));
				vet.setImagem(resultSet.getBytes(16));
				vet.setCnpj(resultSet.getString(17));
				
			}else{
				return vet;
			}
			statement.execute();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vet;
	}
	
	
	public Veterinario buscarPorEmailAndCpf(String email, String cpf){
		
		Veterinario vet = null;
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "SELECT * FROM veterinario WHERE email = ? and cpf = ?";
			PreparedStatement statement = conexao.prepareStatement(querry);
			
			statement.setString(1, email);
			statement.setString(2, cpf);
			ResultSet resultSet= statement.executeQuery();
			
			if(resultSet.next()){
				vet= new Veterinario();
				vet.setId(resultSet.getInt(1));
				vet.setEmail(resultSet.getString(2));
				vet.setNomeEmpresa(resultSet.getString(3));
				vet.setDescricao(resultSet.getString(4));
				vet.setAtendimento(resultSet.getString(5));
				vet.setCep(resultSet.getString(6));
				vet.setEndereco(resultSet.getString(7));
				vet.setNumero(resultSet.getString(8));
				vet.setCidade(resultSet.getString(9));
				vet.setNomeVet(resultSet.getString(10));
				vet.setCpf(resultSet.getString(11));
				vet.setCelular(resultSet.getString(12));
				vet.setCrmv(resultSet.getString(13));
				vet.setEstado(resultSet.getString(14));
				vet.setBairro(resultSet.getString(15));
				vet.setImagem(resultSet.getBytes(16));
				vet.setCnpj(resultSet.getString(17));
				
			}else{
				return vet;
			}
			statement.execute();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vet;
	}
	
	public boolean verificaEmailExiste(String email){
		
		
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "SELECT email FROM veterinario WHERE email = ?";
			PreparedStatement statement = conexao.prepareStatement(querry);
			
			statement.setString(1, email);
			ResultSet resultSet= statement.executeQuery();
			if(resultSet.next()){
				if (email.equals(resultSet.getString(1))){
					return true;
				}
			}
			statement.execute();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	
	public boolean verificaCpfExiste(String cpf){
		
		
		try {
			Connection conexao = ConectaMysql.obtemConexao();
			String querry= "SELECT cpf FROM veterinario WHERE cpf = ?";
			PreparedStatement statement = conexao.prepareStatement(querry);
			
			statement.setString(1, cpf);
			ResultSet resultSet= statement.executeQuery();
			if(resultSet.next()){
				if (cpf.equals(resultSet.getString(1))){
					return true;
				}
			}
			statement.execute();
			conexao.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	}
	
	public ArrayList<Veterinario> veterinariosCidadeAndEspecialidade(String cidade, String especialidade){
		
		ArrayList<Veterinario> lista =  new ArrayList<Veterinario>();
		try {
			Connection connection = ConectaMysql.obtemConexao();
			String querry = "SELECT veterinario.* FROM veterinario INNER JOIN especialidade ON veterinario.id = "
					+ "especialidade.id WHERE veterinario.cidade = ? AND especialidade LIKE ? ";
			PreparedStatement statemnt = connection.prepareStatement(querry);
			statemnt.setString(1, cidade);
			statemnt.setString(2, "%"+especialidade+"%");
			ResultSet resultSet= statemnt.executeQuery();
			
			while(resultSet.next()){
				Veterinario vet= new Veterinario();
				vet.setId(resultSet.getInt(1));
				vet.setEmail(resultSet.getString(2));
				vet.setNomeEmpresa(resultSet.getString(3));
				vet.setDescricao(resultSet.getString(4));
				vet.setAtendimento(resultSet.getString(5));
				vet.setCep(resultSet.getString(6));
				vet.setEndereco(resultSet.getString(7));
				vet.setNumero(resultSet.getString(8));
				vet.setCidade(resultSet.getString(9));
				vet.setNomeVet(resultSet.getString(10));
				vet.setCpf(resultSet.getString(11));
				vet.setCelular(resultSet.getString(12));
				vet.setCrmv(resultSet.getString(13));
				vet.setEstado(resultSet.getString(14));
				vet.setBairro(resultSet.getString(15));
				vet.setImagem(resultSet.getBytes(16));
				vet.setCnpj(resultSet.getString(17));
				lista.add(vet);
				
			}
			statemnt.executeQuery();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
		
	}
	
}
