package br.com.fiapride.model;

public class Armário {
    public int tamanhoEmCm;
    public String material;
    public String estrutura;
    

    public int volumeOcupado = 0;

    public Armário(int tamanho, String material, String estrutura) {
        this.tamanhoEmCm = tamanho;
        this.material = material;
        this.estrutura = estrutura;
    }

    public void guardarItem(int volumeItem) {
        if (volumeItem <= 0) {
            System.out.println("Erro: O volume do item deve ser positivo.");
            return;
        }

        if ((this.volumeOcupado + volumeItem) > this.tamanhoEmCm) {
            System.out.println("Erro: Espaço insuficiente no armário!");
            return;
        }

        this.volumeOcupado += volumeItem;
        System.out.println("Item guardado com sucesso! Espaço ocupado: " + this.volumeOcupado + "cm.");
    }

    public void esvaziarArmário() {
        this.volumeOcupado = 0;
        System.out.println("O armário foi esvaziado.");
    }
}