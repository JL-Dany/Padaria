
package com.mycompany.padaria;

public class Alimento {
    protected String nome;
    protected double preco;
    
    public Alimento (String nome, double preco){
    this.nome = nome;
    this.preco = preco;
    }
    public String descrever(){
    return "Alimento: "+nome;
    }
    public double lucro(double custo){
    return preco - custo;
    }
     public double lucro(double custo, int quantidade){
    return (preco - custo)*quantidade;
    }
}
