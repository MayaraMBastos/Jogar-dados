package com.dados.Jogar.dados.Model;

public class M_Jogar {

    private int soma;
    private int[] dados;
    private int maior;

    public M_Jogar(int soma, int[] dados, int maior) {
        this.soma = soma;
        this.dados = dados;
        this.maior = maior;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int[] getDados() {
        return dados;
    }

    public void setDados(int[] dados) {
        this.dados = dados;
    }

    public int getMaior() {
        return maior;
    }

    public void setMaior(int maior) {
        this.maior = maior;
    }
}
