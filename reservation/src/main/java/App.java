
import dao.ModalidadeDAO;
import dao.PasseioDAO;
import domain.Modalidade;
import domain.Passeio;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        System.out.println(JDBCConnection.getConnection());

//        Modalidade modalidade = new Modalidade();
//        modalidade.setNome("Tour");
//
//        new ModalidadeDAO().salvar(modalidade);
//
        Modalidade modalidade = new Modalidade();

        modalidade.setIdModalidade(8);
        modalidade.setNome("Hipismo 2");

        new ModalidadeDAO().atualizar(modalidade);
//
//        modalidade.setIdModalidade(8);
//        new ModalidadeDAO().deletar(modalidade);
//
//        ModalidadeDAO modalidadeDao = new ModalidadeDAO();
//
//        List<Modalidade> modalidades = modalidadeDao.listarTodos();
//
//        for (Modalidade modalidade: modalidades) {
//            System.out.println(modalidade);
//        }
//
//        Passeio passeio = new Passeio();
//        passeio.setDescricao("Viagem em realidade virtual por Nárnia");
//
//        new PasseioDAO().salvar(passeio);
//
//
//        passeio.setIdPasseio(4);
//        passeio.setNome("Passeio Virtual Publico");
//        passeio.setDescricao("Viagem em realidade virtual por Viamão");
//        new PasseioDAO().atualizar(passeio);
//

//        Passeio passeio = new Passeio();
//        passeio.setIdPasseio(4);
//        new PasseioDAO().deletar(passeio);

//        PasseioDAO passeioDAO = new PasseioDAO();
//
//        List<Passeio> passeios = passeioDAO.listarTodos();
//
//        for (Passeio passeio: passeios) {
//            System.out.println(passeio);
//        }

    }
}
