package model;

import service.CalculoAluguel;
import service.CalculoAluguelMoto;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String modelo, String placa, int cilindrada) {
        super(modelo, placa, new CalculoAluguelMoto());
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}