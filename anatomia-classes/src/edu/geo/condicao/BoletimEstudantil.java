package edu.geo.condicao;
public class BoletimEstudantil{
    public static void main(String[] args) {
        int nota = 7;
        
        if (nota < 6){
            System.out.println("Reprovado");
        } else if (nota == 6){
            System.out.println("Prova minerva");
        } else {
            System.out.println("Aprovado");
        }
    }  
}