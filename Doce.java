
package com.mycompany.padaria;

public class Doce extends Alimento{
private int gramas;

public Doce (String nome, double preco, int gramas){
super (nome, preco);
this.gramas = gramas;
}
@Override
public String descrever (){
return "Doce: "+nome+ ", "+gramas+ "g";
}

}
