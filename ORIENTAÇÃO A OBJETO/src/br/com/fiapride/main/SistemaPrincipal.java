package br.com.fiapride.main;

import br.com.fiapride.model.Armário;

public class SistemaPrincipal {

	public static void main(String[] args) {

        Armário meuArmário = new Armário(200, "Madeira", "Vertical");

        System.out.println("--- Testando Armário ---");
        
        meuArmário.guardarItem(50); 
        
        meuArmário.guardarItem(60); 
        
        meuArmário.guardarItem(-10);

        meuArmário.esvaziarArmário();
        meuArmário.guardarItem(30);
    }
}
