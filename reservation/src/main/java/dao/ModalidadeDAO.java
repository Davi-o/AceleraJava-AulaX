package dao;


import domain.Modalidade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ModalidadeDAO implements DAO<Modalidade> {

    private EntityManagerFactory entityManagerFactory = null;
    private EntityManager entityManager = null;

    public void iniciar(){
        this.entityManagerFactory = Persistence.createEntityManagerFactory("reserva-pu");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    public void terminar(){
        if (entityManager != null) {
            entityManager.close();
        }

        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }

    @Override
    public void salvar(Modalidade domain) {
        try {
            this.iniciar();
            entityManager.persist(domain);

        } catch (Exception exception){
            exception.printStackTrace();

        }finally {
            this.terminar();
        }
    }

    @Override
    public void atualizar(Modalidade domain) {
        try {
            this.iniciar();
            entityManager.persist(domain);

        } catch (Exception exception){
            exception.printStackTrace();

        }finally {
            this.terminar();
        }
    }

    @Override
    public void deletar(Modalidade domain) {
        try {
            this.iniciar();
            entityManager.remove(domain);

        } catch (Exception exception){
            exception.printStackTrace();

        }finally {
            this.terminar();
        }
    }

    public Modalidade listarUm(int idModalidade){
        try {
            this.iniciar();
            Modalidade modalidade = this.entityManager.find(Modalidade.class, idModalidade);
            return modalidade;
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            this.terminar();
        }
        return null;
    }

    @Override
    public List<Modalidade> listarTodos() {
//        try {
//            String sql = "SELECT * FROM modalidade";
//
////            Connection conexao = JDBCConnection.getConnection();
//            PreparedStatement ps = conexao.prepareStatement(sql);
//
//            ResultSet resultado = ps.executeQuery();
//            List<Modalidade> modalidades = new ArrayList<>();
//
//            while (resultado.next()){
//                Modalidade modalidade = new Modalidade();
//
//                modalidade.setIdModalidade(resultado.getInt("id_modalidade"));
//                modalidade.setNome(resultado.getString("nome"));
//
//                modalidades.add(modalidade);
//            }
//
//            return modalidades;
//        } catch (SQLException exception) {
//            exception.printStackTrace();
//        }
        return null;
    }
}
