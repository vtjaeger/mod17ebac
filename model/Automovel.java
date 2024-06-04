package model;

public abstract class Automovel {
    private String marca;
    private String modelo;
    private Combustivel combustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public Automovel(String marca, String modelo, Combustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
    }

    public void detalhes() {
        System.out.println("Sou um " + getClass().getSimpleName() + " da marca " + getMarca() + " e modelo " + getModelo() + "!");
    }
}
