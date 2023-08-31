package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;



@Entity
@Table
public class Viagem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private int vagas;
    @Column
    private String destino;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "piloto_id")
    private Piloto piloto;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (name = "viagem_passageiro", joinColumns = @JoinColumn(name = "viagem_id"), inverseJoinColumns = @JoinColumn(name = "passageiro_id"))
    private List<Passageiro> passageiros;


    public Viagem(int vagas, String destino) {
        this.vagas = vagas;
        this.destino = destino;
        this.passageiros = new ArrayList<>();
    }


    public void addPassageiro(Passageiro passageiro){
        if (passageiros.size() < vagas ){

            passageiros.add(passageiro);
        }

        else {
            System.out.println("Voo cheio, sem vagas disponiveis");
        }

    }




    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        if (passageiros.size() < vagas){

            this.passageiros = passageiros;
        }


        else
            System.out.println("Não é possivel adicionar essa quantidade de passageiros. Somente " + this.vagas + " vagas restantes");

    }

    @Override
    public String toString() {
        return "Dados da sua viagem: " +
                "id = " + id +
                ", vagas no voo = " + vagas +
                ", destino = '" + destino + '\'' +
                ", \nDados do piloto: " + piloto +
                ", \nDados dos passageiros: " + passageiros;
    }
}
