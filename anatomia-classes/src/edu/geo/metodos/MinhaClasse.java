package edu.geo.metodos;
public class MinhaClasse {
    public static void main (String [] args){
        System.out.print("Olá, mundo!");

        // Declaração de variável
        int ano = 2024; 
        // Alteração do  valor da variável
        ano = 2025; 

        final String BR = "Brasil";
        // BR = "Brazil"; Nesse caso, aconteceria um erro pois declaramos a variável 'BR' como final e ela é toda maiúscula, o que significa que é uma variável cujo valor não pode ser alterado.

        // Atribuindo valores às variáveis para utilizar o método "nomeCompleto" dentro do método principal

        String primeiroNome = "Geovanna";
        String segundoNome = "Vitória";
        
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    // Criando um método que retorna um nome
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "\n" + primeiroNome.concat(" ").concat(segundoNome);
    }

}