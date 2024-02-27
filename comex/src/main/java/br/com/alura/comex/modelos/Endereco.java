package br.com.alura.comex.modelos;

import br.com.alura.comex.executaveis.TradutorAPI;

public class Endereco {

    String nomeDaRua;
    String complemento;
    String cep;
    String estado;
    String cidade;
    int numero;
    String bairro;

    public Endereco(TradutorAPI api) {
        this.nomeDaRua = api.logradouro();
        this.complemento = api.complemento();
        this.cep = api.cep();
        this.estado = api.uf();
        this.cidade = api.localidade();
        this.bairro = api.bairro();
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getEstado() {
        return estado;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    @Override
    public String toString() {
        return ">> Dados do Endereço:  \n" +
                "Nome da Rua: " + nomeDaRua + "\n" +
                "Bairro: " + bairro + "\n" +
                "Cep: " + cep + "\n" +
                "Cidade: " + cidade + "\n" +
                "Estado: " + estado + "\n" +
                "Número: " + numero + "\n" +
                "Complemento: " + complemento + "\n";
    }



}
