package domain;

public class Passeio {
    private int idPasseio;
    private String nome;
    private String descricao;

    public int getIdPasseio() {
        return idPasseio;
    }

    public void setIdPasseio(int idPasseio) {
        this.idPasseio = idPasseio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Passeio{" +
                "idPasseio=" + idPasseio +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
