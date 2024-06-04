package classes;

import model.Automovel;
import model.Combustivel;

public class Caminhao extends Automovel {
    private double peso;
    private int eixos;

    public Caminhao(String marca, String modelo, Combustivel combustivel, double peso, int eixos) {
        super(marca, modelo, combustivel);
        this.peso = peso;
        this.eixos = eixos;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

}
