import java.util.ArrayList;
import java.util.List;

public class biblioteca {

    private String nome;
    private String dono;
    private List
    private String funcionarios;

    public biblioteca(String nome, String dono, String livros, String funcionarios){

        this.dono = dono;
        this.nome = nome;

    }

    public String getDono() {
        return dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

}