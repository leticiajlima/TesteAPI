package br.com.alura.comex.executaveis;

import br.com.alura.comex.modelos.Cliente;
import br.com.alura.comex.modelos.Pedido;
import br.com.alura.comex.modelos.Produto;

import java.time.LocalDate;
import java.util.ArrayList;

public class testaPedido {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Persona Royal 5");
        produto1.setDescricao(" Persona 5 é um jogo eletrônico de RPG desenvolvido pela Atlus");
        produto1.setPrecoUnitario(174.90);
        produto1.setQuantidade(1);

        Produto produto2 = new Produto();
        produto2.setNome("Baldur Gate 3");
        produto2.setDescricao("Baldur's Gate III é um jogo eletrônico de RPG desenvolvido e publicado pela Larian Studios.");
        produto2.setPrecoUnitario(199.00);
        produto2.setQuantidade(1);

        Produto produto3 = new Produto();
        produto3.setNome("Stardew Valley");
        produto3.setDescricao("Stardew Valley é um videogame RPG de simulação desenvolvido por Eric ConcernedApe.");
        produto3.setPrecoUnitario(24.99);
        produto3.setQuantidade(3);

        Cliente cliente = new Cliente();
        cliente.setNome("Helena Julia Alana Ferreira");


        System.out.println("Produto: " + produto1.getNome());
        System.out.println("Preço: " + produto1.getPrecoUnitario());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Data: " + LocalDate.now());

        Pedido pedido1 = new Pedido("Jogo",produto1.getNome(),cliente, produto1.getPrecoUnitario(),1,LocalDate.now() );
        Pedido pedido2= new Pedido("Jogo",produto2.getNome(),cliente,produto2.getPrecoUnitario(),1,LocalDate.now() );
        Pedido pedido3 = new Pedido("Jogo", produto3.getNome(), cliente, produto3.getPrecoUnitario(), 3, LocalDate.now());

        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);


        Pedido pedidoMaisCaro = Pedido.encontraPedidoMaisCaro(pedidos);
        Pedido pedidoMaisBarato = Pedido.encontraPedidoMaisBarato(pedidos);

        if (pedidoMaisCaro != null) {
            System.out.println("Pedido mais caro:");
            System.out.println("Produto: " + pedidoMaisCaro.getProduto());
            System.out.println("Preço: " + pedidoMaisCaro.getPreco());
        } else {
            System.out.println("Não foi possível encontrar o pedido mais caro.");
        }


        if (pedidoMaisBarato != null) {
            System.out.println("Pedido mais barato:");
            System.out.println("Produto: " + pedidoMaisBarato.getProduto());
            System.out.println("Preço: " + pedidoMaisBarato.getPreco());
        } else {
            System.out.println("Não foi possível encontrar o pedido mais barato.");
        }
   }
}
