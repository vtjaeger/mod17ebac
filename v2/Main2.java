package v2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main2 {
    public static void main(String[] args) {
        List<?> lista = new ArrayList<>();
        Carro<String> carro = new Carro<String>("Honda");
        Carro<Long> carro2 = new Carro<>(1l);
    }
}
