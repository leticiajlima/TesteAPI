package br.com.alura.comex.modelos;

public class Produto {
        String nome;
        String descricao;
        double precoUnitario;
        int quantidade;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
        public String toString () {
            return ">> Dados do Produto \n" +
                    "Nome: " + nome + "\n" +
                    "Descrição: " + descricao + "\n" +
                    "Preço: " + precoUnitario + "\n" +
                    "Quantidade: " + quantidade;
        }
    }


