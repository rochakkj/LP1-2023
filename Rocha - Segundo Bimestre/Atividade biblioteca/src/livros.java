public class livros {

    private String nome;
    private String autor;
    private String ano;

    public livros(String nome, String autor, String ano) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
    }
    public String getNome() {
        return nome;
    }
    public String getAutor() {
        return autor;
    }

    public String getAno() {
        return ano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}