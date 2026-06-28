package model;

import service.CalculoAluguel;
import service.CalculoAluguelCarro;

public class Carro extends Veiculo {


    private CalculoAluguel calculoAluguel;

    public Carro(String modelo, String placa) {
        super(modelo, placa, new CalculoAluguelCarro());
    }

}
