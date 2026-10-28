
package com.mycompany.padaria;

public class Pao extends Alimento{
private String tipo;

public Pao (String nome, double preco, String tipo){
super (nome, preco);
this.tipo = tipo;
}
@Override
public String descrever (){
return "Pão: "+nome+ "tipo "+tipo;
}
}
