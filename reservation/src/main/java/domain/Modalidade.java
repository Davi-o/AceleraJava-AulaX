package domain;

import javax.persistence.*;

@Entity
@Table(name = "modalidade")
public class Modalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_modalidade")
    private Integer idModalidade;
    private String nome;

    public Modalidade() { }

    public Integer getIdModalidade() {
        return idModalidade;
    }

    public void setIdModalidade(Integer idModalidade) {
        this.idModalidade = idModalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Modalidade{" +
                "idModalidade=" + idModalidade +
                ", nome='" + nome + '\'' +
                '}';
    }
}