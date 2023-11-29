

package model;


public class Esporte {
  
    private int id;
    private String nome;
    private String descricao;
    private String duracao;

    public Esporte() {
    }

    public Esporte(int id, String nome, String descricao, String duracao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Esporte{" + "nome=" + nome + '}';
    }

    
}
