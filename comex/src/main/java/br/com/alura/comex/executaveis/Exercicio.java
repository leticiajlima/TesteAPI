package br.com.alura.comex.executaveis;

import br.com.alura.comex.modelos.Cliente;
import br.com.alura.comex.modelos.Produto;

public class Exercicio {
    public static void main(String[] args) {
        //* Exercicio 1 *//

        Produto produto = new Produto();
        produto.setNome("Jogo Persona 5 Royal");
        produto.setPrecoUnitario(174.90);
        produto.setDescricao("Persona 5 é um jogo eletrônico de RPG desenvolvido pela Atlus.");

        Produto produto1 = new Produto();
        produto1.setNome("Jogo Baldur Gate 3");
        produto1.setPrecoUnitario(199.00);
        produto1.setDescricao("Baldur's Gate III é um jogo eletrônico de RPG desenvolvido e publicado pela Larian Studios. " +
                "É o terceiro jogo principal da série Baldur's Gate, que é baseada no sistema de RPG de mesa Dungeons & Dragons.");

        System.out.println("Bem-Vindo a RPG Store");
        System.out.println("____________________________________");


        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Descrição do Produto: " + produto.getDescricao());
        System.out.println("Preço do Produto: " + produto.getPrecoUnitario());
        System.out.println("------------------------------------------");

        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Descrição do Produto: " + produto1.getDescricao());
        System.out.println("Preço do Produto: " + produto1.getPrecoUnitario());
        System.out.println("------------------------------------------");


        //* Exercicio 2 *//

        if (produto.equals(produto1)){
            System.out.println("Os produtos são iguais!!");
        }
        else
            System.out.println("Os produtos não são iguais!!");


        //* Exercicio 3 *//

        System.out.println(produto.toString());
        System.out.println(produto1.toString());






        //* Exercicio 5 *//

        Cliente cliente = new Cliente();
        cliente.setNome("Sebastiana Isadora da Rosa");
        cliente.setCPF("995.108.412-50");

        cliente.setEmail("sebastiana_darosa@rafaeladson.com");
        cliente.setTelefone("01/02/1999");

        System.out.println(cliente.toString());








    }
}
