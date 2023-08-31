package entity;

import jakarta.persistence.*;

@Entity
@Table
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "turma_id")
    private Turma turma;

    @Column
    private Double nota;


    public Nota(Double nota) {
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "id=" + id +
                ", turma=" + turma +
                ", nota=" + nota +
                '}';
    }
}
