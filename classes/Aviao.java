package classes;

import model.Automovel;
import model.Combustivel;

public class Aviao extends Automovel {
    private Integer capacidadeDeTripulantes;
    private Double comprimento;

    public Integer getCapacidadeDeTripulantes() {
        return capacidadeDeTripulantes;
    }

    public void setCapacidadeDeTripulantes(Integer capacidadeDeTripulantes) {
        this.capacidadeDeTripulantes = capacidadeDeTripulantes;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Aviao(String marca, String modelo, Combustivel combustivel, Integer capacidadeDeTripulantes, Double comprimento) {
        super(marca, modelo, combustivel);
        this.capacidadeDeTripulantes = capacidadeDeTripulantes;
        this.comprimento = comprimento;
    }

}
