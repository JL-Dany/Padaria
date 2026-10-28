
package com.mycompany.padaria;

public class Padaria {

    public static void main(String[] args) {
    Alimento p = new Pao ("Francês", 2.5, "tradicional");
    Alimento d = new Doce ("Brigadeiro", 3.5, 30);
    
    Alimento [] comidas ={
    new Pao ("Francês", 2.5, "tradicional"),
    new Doce ("Brigadeiro", 3.5, 30),
    };
    for (Alimento item: comidas){
    System.out.println (item.descrever());
    }
    System.out.println(p.lucro(1));
    System.out.println(p.lucro(1, 6));
    }
}
