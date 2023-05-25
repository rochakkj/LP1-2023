import java.util.ArrayList;
import java.util.List;

public class biblioteca {

    private String nome;
    private dono dono;
    private List<livros> livros = new ArrayList<>();
    private List<funcionarios> funcionarios = new ArrayList<>();

    public biblioteca(String nome, dono dono){
        this.dono = dono;
        this.nome = nome;
    }

    public List<livros> getLivros(){
        return livros;
    }

    public void setLivros(List<livros> livros){
        this.livros = livros;
    }
    public void addLivros (livros livros){
        this.livros.add(livros);
    }

    public List<funcionarios> getFuncionarios(){
        return funcionarios;
    }

    public void setFuncionarios(List<funcionarios> funcionarios){
        this.funcionarios = funcionarios;
    }
    public void addFuncionarios (funcionarios funcionarios){
        this.funcionarios.add(funcionarios);
    }

    public dono getDono() {
        return dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(dono dono) {
        this.dono = dono;
    }

    public void mostrarLivros() {
        System.out.print("=======Livros=======\n");
        for (livros livro: livros) {
            System.out.println("Livro: " + livro.getNome());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Data de publicação: " + livro.getAno());
            System.out.println();
        }
    }
}