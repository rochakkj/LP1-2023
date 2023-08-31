package entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profesor_id")
    private Professor professor;

    @Column
    private int horario;

    @Column
    private String codigo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private List<Aluno> alunos;


    public Turma(int horario, String codigo) {
        this.horario = horario;
        this.codigo = codigo;
    }


    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", professor=" + professor +
                ", horario=" + horario +
                ", codigo='" + codigo + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
