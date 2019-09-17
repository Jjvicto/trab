package qacademico;

public class Pessoa {

    private String nome;
    private int matricula;
    private String cpf;
    private String endereco;
    private String horario;

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int m) {
        this.matricula = m;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String e) {
        this.endereco = e;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String h) {
        this.horario = h;
    }
    
    
}
