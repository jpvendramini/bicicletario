package connectionDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

import models.Bicicleta;
import models.Condominos;
import java.sql.SQLException;
import java.util.ArrayList;

public class BicicletarioDAO {
    //
    private static Connection connection;
    
    public BicicletarioDAO() {
        BicicletarioDAO.connection = new FactoryConnection().getConnection();
    }
    
    public static void salvar(Condominos condomino, String id) {
    	String sql = "";
        try {
            if(id == null){
                sql = "INSERT INTO condomino(nome,bloco,numero,telefone,modelo,cor,vaga) VALUES(?,?,?,?,?,?,?)";
    		PreparedStatement stmt = connection.prepareStatement(sql);
    		
    		stmt.setString(1, condomino.getNome());
    		stmt.setInt(2, condomino.getBloco());
    		stmt.setInt(3, condomino.getNumero());
    		stmt.setString(4, condomino.getTelefone());
    		stmt.setString(5, condomino.getBicicleta().getModelo());
    		stmt.setString(6, condomino.getBicicleta().getCor());
    		stmt.setString(7, condomino.getBicicleta().getVaga());
    		
    		stmt.execute();
                stmt.close();
            }else{
                sql = "UPDATE condomino SET nome = ?, bloco = ?, numero = ?, telefone = ?, modelo = ?, cor = ?, vaga = ? WHERE condomino.id = ?";
                
                PreparedStatement stmt = connection.prepareStatement(sql);
                
                stmt.setString(8, id);
                stmt.setString(1, condomino.getNome());
    		stmt.setInt(2, condomino.getBloco());
    		stmt.setInt(3, condomino.getNumero());
    		stmt.setString(4, condomino.getTelefone());
    		stmt.setString(5, condomino.getBicicleta().getModelo());
    		stmt.setString(6, condomino.getBicicleta().getCor());
    		stmt.setString(7, condomino.getBicicleta().getVaga());
                stmt.execute();
                stmt.close();
            }
    	}catch(SQLException e) {
    		throw new RuntimeException(e);
    	}
    }
    public static ArrayList<Condominos> listarTodos() {
    	connection = new FactoryConnection().getConnection();
    	try {
    		ArrayList<Condominos> condominos = new ArrayList<Condominos>();
    		
    		
    		PreparedStatement ps = connection.prepareStatement("SELECT * FROM condomino");
    		ResultSet rs = ps.executeQuery();
    		
    		while(rs.next()) {
    			Bicicleta bicicleta = new Bicicleta(
    					rs.getString("modelo"),
        				rs.getString("cor"),
        				rs.getString("vaga")
    			);
    			
    			Condominos condomino = new Condominos(
        				rs.getString("nome"),
        				rs.getInt("bloco"),
        				rs.getInt("numero"),
        				rs.getString("telefone"), bicicleta
        		);
    			
    			condominos.add(condomino);
    		}
    		
    		return condominos;
    		
    		
    	}catch(SQLException e) {
    		e.getMessage();
    		JOptionPane.showMessageDialog(null, "Erro preencher arraylist");
    		return null;
    	}
    }
    
    
    
    public static Condominos buscar(String id){
        try{
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM condomino");
            ResultSet rs = ps.executeQuery();
            Condominos condomino = null;
            while(rs.next()) {
                if(rs.getString(1).equals(id)){
                    Bicicleta bicicleta = new Bicicleta(
                                    rs.getString("modelo"),
                                    rs.getString("cor"),
                                    rs.getString("vaga")
                    );

                    condomino = new Condominos(
                                    rs.getString("nome"),
                                    rs.getInt("bloco"),
                                    rs.getInt("numero"),
                                    rs.getString("telefone"), bicicleta
                    );
                }
            }
            return condomino;
            
        }catch(SQLException e){
            e.getMessage();
            JOptionPane.showMessageDialog(null, "Erro ao buscar id!");
            return null;
        }
        
    }
    public static void deletar(String id){
        try{
            String sql = "DELETE FROM condomino WHERE id=?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, id);
            stmt.execute();
            stmt.close();
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
