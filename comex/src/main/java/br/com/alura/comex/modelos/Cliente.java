package br.com.alura.comex.modelos;

import br.com.alura.comex.executaveis.TradutorApiLetiCliente;

public class Cliente {
    private String nome;
    private String CPF;
    private String email;
    private String telefone;
    private Endereco endereco;

    private int idade;
    private int id;
    private int idConta;

    public Cliente(){

    }
    public Cliente(String CPF){
        setCPF(CPF);
    }
    public Cliente(TradutorApiLetiCliente api) {
        this.nome = api.nome();
        this.CPF = api.cpf();
        this.email = "";
        this.telefone = "";
        this.endereco = null;
        this.idade = api.idade();
        this.id = api.id();
        this.idConta = api.idConta();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        int numDeCaracteres = CPF.length();
      if (numDeCaracteres == 11) this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return ">> Dados do Cliente:  \n" +
                "Nome: " + nome + "\n" +
                "CPF: " + CPF + "\n" +
                "E-Mail: " + email + "\n" +
                "Telefone: " + telefone + "\n" +
                "Endereço: " + endereco + "\n";
    }
}

