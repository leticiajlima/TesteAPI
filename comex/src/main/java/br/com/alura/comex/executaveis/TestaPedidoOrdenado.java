package br.com.alura.comex.executaveis;

import br.com.alura.comex.modelos.Cliente;
import br.com.alura.comex.modelos.Pedido;
import br.com.alura.comex.modelos.Produto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaPedidoOrdenado {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Persona Royal 5");
        produto1.setDescricao("Persona 5 é um jogo eletrônico de RPG desenvolvido pela Atlus");
        produto1.setPrecoUnitario(174.90);
        produto1.setQuantidade(12);

        Produto produto2 = new Produto();
        produto2.setNome("Baldur Gate 3");
        produto2.setDescricao("Baldur's Gate III é um jogo eletrônico de RPG desenvolvido e publicado pela Larian Studios.");
        produto2.setPrecoUnitario(199.00);
        produto2.setQuantidade(10);

        Produto produto3 = new Produto();
        produto3.setNome("Stardew Valley");
        produto3.setDescricao("Stardew Valley é um videogame RPG de simulação desenvolvido por Eric ConcernedApe.");
        produto3.setPrecoUnitario(24.99);
        produto3.setQuantidade(30);

        Produto produto4 = new Produto();
        produto4.setNome("Persona 3 Reload");
        produto4.setDescricao("Persona 3 Reload é um jogo eletrônico de RPG desenvolvido pela Atlus");
        produto4.setQuantidade(10);
        produto4.setPrecoUnitario(350.00);

        Produto produto5 = new Produto();
        produto5.setNome("Elder Ring");
        produto5.setDescricao("Um é um jogo eletrônico de RPG de ação em terceira pessoa, desenvolvida pela FromSoftware");
        produto5.setQuantidade(15);
        produto5.setPrecoUnitario(299.00);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Rosangela da Silva Alves");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Rodrigo Lima de Oliveira");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Larissa Alves de Lima");

        ArrayList<Pedido> pedidos = new ArrayList<>();
        Pedido pedido1 = new Pedido("Jogo", produto1.getNome(), cliente1, produto1.getPrecoUnitario(), 2, LocalDate.now());
        Pedido pedido2 = new Pedido("Jogo", produto2.getNome(), cliente2, produto2.getPrecoUnitario(), 3, LocalDate.now());
        Pedido pedido3 = new Pedido("Jogo", produto3.getNome(), cliente3, produto3.getPrecoUnitario(), 2, LocalDate.now());
        Pedido pedido4 = new Pedido("Jogo", produto5.getNome(), cliente2, produto5.getPrecoUnitario(), 1, LocalDate.now());
        Pedido pedido5 = new Pedido("Jogo", produto4.getNome(), cliente3, produto4.getPrecoUnitario(), 6, LocalDate.now());

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);


        Collections.sort(pedidos, Comparator.comparingDouble(Pedido::getPreco).reversed());
        System.out.println("Pedidos ordenados pelo maior valor:");
        for (Pedido pedido : pedidos) {
            System.out.println("Produto: " + pedido.getProduto());
            System.out.println("Preço: " + pedido.getPreco());
            System.out.println();
        }

        Collections.sort(pedidos, Comparator.comparingDouble(Pedido::getPreco));
        System.out.println("Pedidos ordenados pelo menor valor:");
        for (Pedido pedido : pedidos) {
            System.out.println("Produto: " + pedido.getProduto());
            System.out.println("Preço: " + pedido.getPreco());
            System.out.println();


        }
    }
}





