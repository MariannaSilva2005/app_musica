public class Album {
    private int id;
    private String nome;
    private int duracao;


    public Album() {
    }

    public Album(int id, String nome, int duracao) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


}
