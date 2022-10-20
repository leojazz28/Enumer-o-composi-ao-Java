public class Departamento {
    private String nome;

    public Departamento(){} // COMSTRUTOR PADRÃO

    public  Departamento(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return  nome;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }
}
