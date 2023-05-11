package recursoshumanos;
public abstract class Empregado {
    private String nome;
    private String sobreNome;
    private String cpf;
    
    public abstract double vencimento();

    public Empregado() {
    }

    public Empregado(String nome, String sobreNome, String cpf) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", sobreNome=" + sobreNome + ", cpf=" + cpf + '}';
    }
}
