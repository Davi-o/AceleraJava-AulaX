package dao;

import domain.Modalidade;
import domain.Passeio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PasseioDAO implements DAO<Passeio> {

    @Override
    public void salvar(Passeio domain) {
//        try {
//            String sql = "INSERT INTO tipo_passeio(nome_passeio, descricao_passeio) VALUES (?, ?)";
//
//            Connection conexao = JDBCConnection.getConnection();
//            PreparedStatement ps = conexao.prepareStatement(sql);
//
//            ps.setString(1, domain.getNome());
//            ps.setString(2, domain.getDescricao());
//            ps.execute();
//
//        } catch (SQLException exception){
//            exception.printStackTrace();
//
//        }
    }

    @Override
    public void atualizar(Passeio domain) {
//        try {
//            String sql = "UPDATE tipo_passeio SET nome_passeio = (?), descricao_passeio = (?) WHERE id_tipo_passeio = (?)";
//
//            Connection conexao = JDBCConnection.getConnection();
//            PreparedStatement ps = conexao.prepareStatement(sql);
//
//            ps.setString(1, domain.getNome());
//            ps.setString(2, domain.getDescricao());
//            ps.setInt(3, domain.getIdPasseio());
//
//            ps.execute();
//
//        } catch (SQLException exception) {
//            exception.printStackTrace();
//        }
    }

    @Override
    public void deletar(Passeio domain) {
//        try {
//            String sql = "DELETE FROM tipo_passeio WHERE id_tipo_passeio = (?)";
//
//            Connection conexao = JDBCConnection.getConnection();
//            PreparedStatement ps = conexao.prepareStatement(sql);
//
//            ps.setInt(1, domain.getIdPasseio());
//
//            ps.execute();
//
//        } catch (SQLException exception) {
//            exception.printStackTrace();
//        }
    }

    @Override
    public List<Passeio> listarTodos() {
//        try {
//            String sql = "SELECT * FROM tipo_passeio";
//
//            Connection conexao = JDBCConnection.getConnection();
//            PreparedStatement ps = conexao.prepareStatement(sql);
//
//            ResultSet resultado = ps.executeQuery();
//            List<Passeio> passeios = new ArrayList<>();
//
//            while (resultado.next()){
//                Passeio passeio = new Passeio();
//
//                passeio.setIdPasseio(resultado.getInt("id_tipo_passeio"));
//                passeio.setNome(resultado.getString("nome_passeio"));
//                passeio.setDescricao(resultado.getString("descricao_passeio"));
//
//                passeios.add(passeio);
//            }
//
//            return passeios;
//        } catch (SQLException exception) {
//            exception.printStackTrace();
//        }
        return null;
    }
}
