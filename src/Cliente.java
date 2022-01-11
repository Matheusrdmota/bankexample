public class Cliente {
    private String nome;
    private String cpf;
    private char sexo;

    public Cliente(String nome, String cpf, char sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public char getSexo() {
        return sexo;
    }
}
