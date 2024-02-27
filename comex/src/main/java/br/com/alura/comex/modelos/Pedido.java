package br.com.alura.comex.modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Pedido {
    private String categoria;
    private String produto;
    private Cliente cliente;

    private double preco;
    private int quantidade;

    private LocalDate data;

    public Pedido(String categoria, String produto, Cliente cliente, double preco, int quantidade, LocalDate data) {
        this.categoria = categoria;
        this.produto = produto;
        this.cliente = cliente;
        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getProduto() {
        return produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public double calcularTotal(){
        return preco * quantidade;
    }

    public static Pedido encontraPedidoMaisCaro(ArrayList<Pedido> pedidos) {
        return pedidos.stream()
                .max(Comparator.comparingDouble(Pedido::getPreco))
                .orElse(null);
    }

    public static Pedido encontraPedidoMaisBarato(ArrayList<Pedido> pedidos) {
        return pedidos.stream()
                .min(Comparator.comparingDouble(Pedido::getPreco))
                .orElse(null);
    }


    @Override
    public String toString() {
        return "Pedido{" +
                "categoria='" + categoria + '\'' +
                ", produto='" + produto + '\'' +
                ", cliente='" + cliente + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", data=" + data +
                '}';
    }
}
