import classes.Aviao;
import classes.Caminhao;
import model.Automovel;
import model.Combustivel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Automovel> automoveis = new ArrayList<>();
        Caminhao caminhao1 = new Caminhao("Volvo", "FH", Combustivel.DIESEL, 5246.3, 8);
        var aviao1 = new Aviao("Boeing", "747", Combustivel.QUEROSENE, 110, 2423.5);

        Caminhao caminhao2 = new Caminhao("Scania", "770", Combustivel.GASOLINA, 5873.3, 68);
        var aviao2 = new Aviao("Teste", "Modelo 1", Combustivel.ALCOOL, 50, 100.4);

        automoveis.add(caminhao1);
        automoveis.add(aviao1);
        automoveis.add(caminhao2);
        automoveis.add(aviao2);

        for(Automovel automovel : automoveis) {
            automovel.detalhes();
        }
    }
}
