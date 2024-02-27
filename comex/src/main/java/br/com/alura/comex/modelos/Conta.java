package br.com.alura.comex.modelos;

import br.com.alura.comex.executaveis.TradutorAPI;
import br.com.alura.comex.executaveis.TradutorApiLetiContas;

public class Conta {
    private int num;
    private String tipo;
    private double valor;

    public Conta(TradutorApiLetiContas api) {
        this.num = api.num();
        this.tipo = api.tipo();
        this.valor = api.valor();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return ">> Dados da Conta:  \n" +
                "Numero: " + num + "\n" +
                "Tipo: " + tipo + "\n" +
                "Valor: " + valor + "\n";
    }
}

